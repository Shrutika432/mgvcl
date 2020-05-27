package com.example.external_093
//17BCA093

import android.util.Log

class allData(var Cno: Int,var Cname:String,var Cunit:Int,var PPUnit:Int) {
    override fun toString(): String {
        Log.d("all","ss")
        // return "$id     $name     $quantity   $typeofanimal"
        return "Id: $Cno     name: $Cname     quantity: $Cunit   type: $PPUnit"
//17BCA093
    }
}