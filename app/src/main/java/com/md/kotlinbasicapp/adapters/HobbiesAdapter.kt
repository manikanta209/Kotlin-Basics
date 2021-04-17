package com.md.kotlinbasicapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.md.kotlinbasicapp.Hobby
import com.md.kotlinbasicapp.R
import com.md.kotlinbasicapp.extensions.showToast
import kotlinx.android.synthetic.main.list_item.view.*

class HobbiesAdapter(val context: Context, val hobbies: List<Hobby>) :
    RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby = hobbies[position]
        holder.setData(hobby, position)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        //Create two var to use hobby and positon
        var currentHobby: Hobby? = null
        var currentPosition: Int=0

        init {
            itemView.setOnClickListener {
                // Context is the super class of the activity
                context.showToast(currentHobby!!.title+"Clicked")
            }
        }

        //Hobby? : Hobby of type null able
        fun setData(hobby: Hobby?, pos: Int) {
            hobby?.let {
                itemView.txvTitle.text = hobby.title

                this.currentHobby=hobby
                this.currentPosition=pos
            }
        }
    }
}