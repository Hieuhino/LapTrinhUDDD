package com.example.myapplication.Tuan2

import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R

class Tuan21MainActivityResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tuan21_main_result)
        var tvKQ=findViewById<TextView>( R.id.Tuan2TvkQ)
        val i1=intent
        val chuoi1=i1.extras!!.getString("so1")
        val so1=chuoi1!!.toFloat()
        val chuoi2=i1.extras!!.getString("so1")
        val so2=chuoi2!!.toFloat()
        txKQ!!.text=tong.toSring()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}