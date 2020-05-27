package com.example.external_093

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dashboard.*
//17BCA093

class Dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        BtnIns.setOnClickListener {
            //17BCA093
            var intent:Intent= Intent(this,Insert::class.java)
            startActivity(intent)
        }
        BtnVi.setOnClickListener {
            Toast.makeText(this,"clicked",Toast.LENGTH_LONG).show()
            var intent:Intent= Intent(this,com.example.external_093.View::class.java)
            startActivity(intent)
        }
        BtnExit.setOnClickListener {
            finishAndRemoveTask()
            //17BCA093

        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //17BCA093
        menuInflater.inflate(R.menu.mymenu,menu)
        return super.onCreateOptionsMenu(menu)
        //17BCA093
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==R.id.logout)
        {
            var preference=getSharedPreferences("MyPref", Context.MODE_PRIVATE)
            var edit=preference.edit()
            edit.clear()
            //17BCA093
            edit.commit()
            Toast.makeText(this,"Logout Successfully", Toast.LENGTH_LONG).show()
            var intent: Intent = Intent(this,Login::class.java)
            startActivity(intent)
            finish()
        }
        else if(item.itemId==R.id.hello){
            Toast.makeText(this,"hello pressed", Toast.LENGTH_LONG).show()
            //17BCA093

        }

        return super.onOptionsItemSelected(item)
    }
}
