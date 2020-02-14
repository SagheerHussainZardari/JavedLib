package com.sagheer.javedlib

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sagheer.javedlibaray.MyBasicFunctions

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var ans = MyBasicFunctions().add(40, 50)
        Toast.makeText(this, ans, Toast.LENGTH_SHORT).show()

    }
}
