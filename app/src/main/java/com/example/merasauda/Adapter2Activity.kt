package com.example.merasauda


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_diet.view.*
import java.util.*

class Adapter2Activity(val movies: ArrayList<Int>) : RecyclerView.Adapter<MovieViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {

        val inflator = LayoutInflater.from(parent.context)
        return MovieViewHolder(inflator.inflate(R.layout.item_diet, parent, false))

    }

    override fun getItemCount(): Int = movies.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(movies[position])
    }

}

class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(movie: Int) {
        itemView.button11.setBackgroundResource(movie)
    }
}
