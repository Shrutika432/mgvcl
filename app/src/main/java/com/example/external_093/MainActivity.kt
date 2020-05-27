package com.example.external_093

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    //17BCA093
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            var preference=getSharedPreferences("MyPref", Context.MODE_PRIVATE)
            var str=preference.getString("uname","wrong")

            if(str.equals("wrong"))
            {
                //17BCA093
                var intent: Intent = Intent(this,Login::class.java)
                startActivity(intent)
                finish()
            }
            else
            {
                var intent: Intent = Intent(this,Dashboard::class.java)
                startActivity(intent)
                finish()
                //17BCA093
            }
        },3000)
    }
}
