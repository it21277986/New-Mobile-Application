package com.example.newsapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val homeFragment = HomeFragment()
    private val categoryFragment = CategoryFragment()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeBtn: Button = findViewById(R.id.button2)
        val categoryBtn: Button = findViewById(R.id.button3)
        val addNewsBtn: Button = findViewById(R.id.button)

        homeBtn.setOnClickListener {
            loadHome()
        }

        categoryBtn.setOnClickListener {
            loadCategory()
        }

        addNewsBtn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    private fun loadHome() {
        val fragment = supportFragmentManager.findFragmentById(R.id.FragmentContainer)

        if (fragment == null) {
            supportFragmentManager.beginTransaction().add(R.id.FragmentContainer, homeFragment).commit()
        }else {
            supportFragmentManager.beginTransaction().add(R.id.FragmentContainer, homeFragment).commit()
        }
    }

    private fun loadCategory() {
        val fragment = supportFragmentManager.findFragmentById(R.id.FragmentContainer)

        if (fragment == null) {
            supportFragmentManager.beginTransaction().add(R.id.FragmentContainer, categoryFragment).commit()
        }else {
            supportFragmentManager.beginTransaction().add(R.id.FragmentContainer, categoryFragment).commit()
        }
    }
}