package com.example.a15_lesson

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class ViewHolder(obyekt: View): RecyclerView.ViewHolder(obyekt) {
    private val tvTitle: TextView = itemView.ati
    private val tvDescription: TextView = itemView.familiyasi

    fun populateModel(mmm: User, activity: MainActivity){
        tvTitle.text = mmm.name1
        tvDescription.text = mmm.name2
        itemView.setOnClickListener{
            activity.onItemClicked(mmm)
        }
    }
}