package com.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_leo_page.*

class WallisonScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallison_page)
        /*
        btn_back.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }*/
    }
}