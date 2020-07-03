package com.example.merasauda
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.BaseAdapter
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//import kotlinx.android.synthetic.main.activity_main.*
//import kotlinx.android.synthetic.main.item_diet.view.*
//import java.util.*
//
//class diet : AppCompatActivity() {
//
//    val diets = arrayOf("Bulk", "Cut", "Keto", "Special", "Vegan")
//    //    val yearofRelease = arrayOf("2008", "2010", "2011", "2018", "2019")
////    val actors = arrayOf("RDJ", "Chris Hemsworth", "Chris Evans", "Chadwick", "Tom Holland")
//    val image = arrayOf(
//        R.drawable.jeremy1,
//        R.drawable.arnold1,
//        R.drawable.arnold1,
//        R.drawable.arnold1,
//        R.drawable.jeremy1
//    )
//    val list: ArrayList<Diet> = arrayListOf()
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        for (i in 0..4) {
//            //val random = Random().nextInt(5)
//            list.add(
//                Diet(
//
//                    image[i]
//                )
//            )
//        }
//
////        lv.adapter =
////            ArrayAdapter<String>(
////                this,
////                android.R.layout.simple_expandable_list_item_1,
////                list
////            )
//        /*
//        MovieAdapter adapter = new MovieAdapter(list)
//        MovieOnItemClickListener onItemClickListner
//        adapter.onitemClickListener = 5
//         */
//        val adapter = MovieAdapter(list);
////        adapter.onItemClickListener = object : MovieonItemClickListener {
////            override fun onItemClick(movie: Movie) {
////                Toast.makeText(this@Main2Activity,  "hello", Toast.LENGTH_SHORT).show()
////            }
//
////        }
//
//    }
//}
//
//data class Diet(
//
//    val image: Int
//)
//
//class DietAdapter(val movies: ArrayList<Diet>) : BaseAdapter() {
////    var onItemClickListener: MovieonItemClickListener? = null
//
//    override fun getView(pos: Int, convertView: View?, parent: ViewGroup): View {
//        val inflator = LayoutInflater.from(parent.context)
//        val view: View
//
//
////        if (convertView == null) {
////            view = inflator.inflate(R.layout.item_movie, parent, false)
////
////        } else {
////            view = convertView
////        }
//        view = convertView ?: inflator.inflate(R.layout.item_diet, parent, false)
////        view.titleTv.text = movies[pos].name + "(" + movies[pos].year + ")"
////        view.actorTv.text = movies[pos].actor
//        view.button11.setBackgroundResource(diets[pos].image)
////        view.setOnClickListener {
////            onItemClickListener?.onItemClick(movies[pos])
////        }
//        return view
//    }
//
//    override fun getItem(pos: Int): Diet = diets[pos]
//
//    override fun getItemId(pos: Int): Long = pos.toLong()
//
//
//    override fun getCount(): Int = diets.size
//}
//
////interface MovieonItemClickListener {
////    fun onItemClick(movie: Movie)
////}
//
///*
//Class a{
//}
//Class B{
//A a = new a
//}
// */