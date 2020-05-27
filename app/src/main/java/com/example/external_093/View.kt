package com.example.external_093

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_view.*

class View : AppCompatActivity() {
    //17BCA093

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)
        var db = DatabaseHelper(this)
        var arr = db.viewAll()
        Log.d("arr",arr.toString())
        var ada = ArrayAdapter<allData>(this, android.R.layout.simple_list_item_1, arr)
        Lvall.adapter=ada
    }
    //17BCA093

}
