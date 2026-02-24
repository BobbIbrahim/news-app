package com.example.lab1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvNews = findViewById<RecyclerView>(R.id.rvNews)

        val newsList = listOf(
            NewsItem("Campus event today", "A short summary about the campus event.", R.drawable.baseline_school_24, 0xFF1976D2.toInt()),
            NewsItem("New internship openings", "Companies opened new internship positions this week.", R.drawable.baseline_work_24, 0xFF6A1B9A.toInt()),
            NewsItem("Sports tournament", "Registration is open for the weekend tournament.", R.drawable.baseline_sports_24, 0xFFEF6C00.toInt()),
            NewsItem("Library hours changed", "The library schedule was updated for exams.", R.drawable.baseline_library_books_24, 0xFF00796B.toInt()),
            NewsItem("Tech talk announcement", "A guest speaker will talk about Android development.", R.drawable.baseline_event_24, 0xFF303F9F.toInt()),
            NewsItem("Club recruitment", "Student clubs are recruiting new members.", R.drawable.baseline_group_24, 0xFF2E7D32.toInt())
        )

        rvNews.layoutManager = LinearLayoutManager(this)
        rvNews.adapter = NewsAdapter(newsList)

        // Bonus: divider between items
        rvNews.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }
}