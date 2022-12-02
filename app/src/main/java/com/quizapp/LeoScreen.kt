package com.quizapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_leo_page.*

class LeoScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leo_page)
        github.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/leohcavalcanti")))
        }
        /*
        btn_back.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }*/
    }
}