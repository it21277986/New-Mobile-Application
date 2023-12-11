package com.example.newsapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.newsapp.database.News
import com.example.newsapp.database.NewsRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class NewsAdapter(item:List<News>, repository: NewsRepository,
                  viewModel: MainActivity2Data):Adapter<NewsViewHolder>() {

    var context: Context? = null
    var item = item
    val repository = repository
    val viewModel = viewModel

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item, parent, false)
        context = parent.context

        return NewsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return item.size

    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.cbNews.text = item.get(position).item
        holder.ivDelete.setOnClickListener {
            val isChecked = holder.cbNews.isChecked

            if (isChecked) {
                CoroutineScope(Dispatchers.IO).launch {
                    repository.delete(item.get(position))
                    val data = repository.getAllNewsItems()
                    withContext(Dispatchers.Main) {
                    viewModel.setData(item)
                    }
                }
            }else {
                Toast.makeText(context, "Select the item to be Deleted", Toast.LENGTH_LONG).show()
            }
        }
    }

}