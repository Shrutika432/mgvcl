package com.example.external_093

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_insert.*

class Insert : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //17BCA093
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert)
        BtnInsertDetails.setOnClickListener {

            var db=DatabaseHelper(this)
            var Cno=etCno.text.toString().toInt()
            var Cname=etCname.text.toString()
            var Cunit=etNoOfunitsConsumed.text.toString().toInt()
            var PPUnit=etPricePerUnit.text.toString().toInt()
            //17BCA093
            var flag = db.insert(Cno, Cname, Cunit,PPUnit)
            if(flag)
            {
                Toast.makeText(this,"Inserted successfully", Toast.LENGTH_LONG).show()
                etCno.text.clear()
                etCname.text.clear()
                etNoOfunitsConsumed.text.clear()
                //17BCA093
                etPricePerUnit.text.clear()
            }
            else
            {
                Toast.makeText(this,"Error!!", Toast.LENGTH_LONG).show()
            }
        }
        //17BCA093

    }
}
