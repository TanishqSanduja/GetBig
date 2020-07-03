package com.example.merasauda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity(), View.OnClickListener {

    val image= arrayOf(
        R.drawable.jeremy1,
        R.drawable.arnold1

    )
    //val i = image[random]
    override fun onClick(view: View) {
        when (view.id) {
            R.id.button -> {
                val i = Intent(this, Main2Activity::class.java)
                startActivity(i)
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val currentTime = System.currentTimeMillis()
        button.setBackgroundResource(image[0])
        //for (i in 0..2) {
           // val random = Random().nextInt(1)
           // for (i in 0..random!!) {
           // if(i!=2) {
        //waitNsec(10)
        //button.setBackgroundResource(image[1])
        //waitNsec(5)
        //button.setBackgroundResource(image[0])
                //}
            //}


        //}
        val currentTime = System.currentTimeMillis()
        while (System.currentTimeMillis() < currentTime + 5 * 1000) {
            button.setBackgroundResource(image[0])
        }
        button.setBackgroundResource(image[1])
        button.setOnClickListener(this)



    }
    fun waitNsec(n: Int) {
        val currentTime = System.currentTimeMillis()
        while (System.currentTimeMillis() < currentTime + n * 1000) {
            button.setBackgroundResource(image[0])
        }
    }
}
