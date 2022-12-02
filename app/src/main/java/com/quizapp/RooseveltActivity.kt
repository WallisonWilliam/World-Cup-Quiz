package com.quizapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_leo_page.*

class RooseveltActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roosevelt_page)
        /*
        btn_back.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }*/
    }
}