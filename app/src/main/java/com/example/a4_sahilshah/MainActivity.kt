package com.example.a4_sahilshah

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val categories = listOf("Heritage Buildings","Attractions","Museums","Stadiums")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val rvMain: RecyclerView = findViewById(R.id.rvMain)

        rvMain.layoutManager = LinearLayoutManager(this)
        rvMain.adapter = CategoryAdapter(categories)

    }
}