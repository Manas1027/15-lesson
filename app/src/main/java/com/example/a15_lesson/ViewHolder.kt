package com.example.a15_lesson

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val tvTitle: TextView = itemView.tvTitle
    val tvDescription: TextView = itemView.tvDescription

    fun populateModel(user: User){
        tvTitle.text = user.title
        tvDescription.text = user.description
    }
}