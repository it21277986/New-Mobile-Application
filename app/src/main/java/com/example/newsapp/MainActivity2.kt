package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.database.News
import com.example.newsapp.database.NewsDatabase
import com.example.newsapp.database.NewsRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity2 : AppCompatActivity() {

    private lateinit var adapter: NewsAdapter
    private lateinit var viewModel: MainActivity2Data

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val recyclerView: RecyclerView = findViewById(R.id.rvNewsList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val repository = NewsRepository(NewsDatabase.getInstance(this))

        viewModel = ViewModelProvider(this)[MainActivity2Data::class.java]

        viewModel.data.observe(this) {
            adapter = NewsAdapter(it,repository,viewModel)
            recyclerView.adapter = adapter
            recyclerView.layoutManager = LinearLayoutManager(this)
        }

        CoroutineScope(Dispatchers.IO).launch {
            val data = repository.getAllNewsItems()

            runOnUiThread {
                viewModel.setData(data)
            }
        }

        val addItem: Button = findViewById(R.id.btnAddNews)

        addItem.setOnClickListener {
            displayAlert(repository)
        }
    }

    private fun  displayAlert(repository: NewsRepository) {
        val builder = AlertDialog.Builder(this)

        builder.setTitle("Enter News")
        builder.setMessage("Enter the to do News below")

        val input = EditText(this)
        input.inputType = InputType.TYPE_CLASS_TEXT
        builder.setView(input)

        builder.setPositiveButton("ok") {dialog, which ->
            val item = input.text.toString()
            CoroutineScope(Dispatchers.IO).launch {
                repository.insert(News(item))
                val data = repository.getAllNewsItems()
                runOnUiThread {
                    viewModel.setData(data)
                }
            }
        }

        builder.setNegativeButton("cancel") {dialog, which ->
            dialog.cancel()
        }

        val alertDialog = builder.create()
        alertDialog.show()
    }
}