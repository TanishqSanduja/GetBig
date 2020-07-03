package com.example.merasauda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movies = arrayListOf<Int>(R.drawable.arnold1,
            R.drawable.jeremy1,
            R.drawable.arnold1,
            R.drawable.jeremy1,
            R.drawable.arnold1
        )

        rv.layoutManager = GridLayoutManager(this,3,RecyclerView.HORIZONTAL,false)
//        rv.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        rv.adapter = Adapter2Activity(movies)
    }
}