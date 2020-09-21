package com.example.a15_lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adap: ListAdapter = ListAdapter(this)
    private var san: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        RV.adapter = adap
        RV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        RV.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
        setMag()
    }


    fun setMag(){
        val models: MutableList<User> = mutableListOf()

            val model: User = User()
            model.name1 = "Title 1"
            model.name2 = "Description 1"
            model.count = 1
            models.add(model)
            adap.setData(models)
    }

    fun setMag2(user: User){
        val models: MutableList<User> = mutableListOf()
        for( i in 1 .. san+user.count){
            val model: User = User()
            model.name1 = "Title $i"
            model.name2 = "Description $i"
            model.count = i
            san = i
            models.add(model)
        }
        adap.setData(models)
    }

    fun onItemClicked(user: User){
        setMag2(user)
    }

}