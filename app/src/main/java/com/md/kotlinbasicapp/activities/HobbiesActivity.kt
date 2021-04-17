package com.md.kotlinbasicapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.md.kotlinbasicapp.adapters.HobbiesAdapter
import com.md.kotlinbasicapp.R
import com.md.kotlinbasicapp.Supplier
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation= LinearLayoutManager.VERTICAL
        recycleView.layoutManager=layoutManager

        //pass the context and data to adapter and store it in variable adapter
        // Here data may be anything, ex:you can pass just a listview
        val adapter= HobbiesAdapter(this, Supplier.hobbies)

        //set adapter to recycler view
        recycleView.adapter=adapter
    }
}