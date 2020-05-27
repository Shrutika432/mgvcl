package com.example.external_093

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(var context: Context): SQLiteOpenHelper(context,DB_NAME,null,VERSION)  {
    companion object
    //17BCA093
    {
        var DB_NAME:String="MYDB"
        var TB_NAME="EDetail"
        var VERSION=1
        var Customer_No="Cno"
        var Customer_NAME="Cname"
        var Consumed_units="Cunit"
        var Price_per_unit="PPUnit"
        //17BCA093
    }
    override fun onCreate(db: SQLiteDatabase?) {
        var query="create table $TB_NAME($Customer_No int(10),$Customer_NAME varchar(20),$Consumed_units int(50),$Price_per_unit int(50))"
        db!!.execSQL(query)
    }
    //17BCA093
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    fun insert(Cno:Int,Cname:String,Cunit:Int,PPUnit:Int):Boolean
    {
        var db=writableDatabase
        //17BCA093
        var cv= ContentValues()
        cv.put(Customer_No,Cno)
        cv.put(Customer_NAME,Cname)
        cv.put(Consumed_units,Cunit)
        cv.put(Price_per_unit,PPUnit)
        //17BCA093
        var flag=db.insert(TB_NAME,null,cv)
        db.close()

        if(flag>0)
        {
            return true
        }
        else
        {
            return false
            //17BCA093
        }
    }

    fun viewAll():ArrayList<allData>
    {
        var db=readableDatabase
        var cor: Cursor =db.query(TB_NAME, null,null,null,null,null,null)
        var arrAll=ArrayList<allData>()
        //17BCA093

        while (cor.moveToNext())
        {
            var Cno=cor.getInt(0)
            var Cname=cor.getString(1)
            var Cunit=cor.getInt(2)
            var PPUnit=cor.getInt(3)

            var a=allData(Cno, Cname, Cunit,PPUnit)
            //17BCA093

            arrAll.add(a)
        }
        return  arrAll
    }
}