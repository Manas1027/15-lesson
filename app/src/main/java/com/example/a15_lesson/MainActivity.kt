package com.example.a15_lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val adapter: ListAdapter = ListAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        setData()
    }

    fun setData(){
        val models: MutableList<User> = mutableListOf()
        for( i in 0 until 500){
            val model: User = User()
            model.title = "Title ${i+1}"
            model.description = "Description ${i+1}"
            models.add(model)
        }
        adapter.setData(models)
    }

}