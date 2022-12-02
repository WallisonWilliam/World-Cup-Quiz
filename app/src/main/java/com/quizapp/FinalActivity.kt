package com.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_final.*


class FinalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
        window.decorView.apply {
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }
        leo_info.setOnClickListener {
            openLeoScreen()
        }
        roosevelt_info.setOnClickListener{
            openRooseveltScreen()
        }
        wallison_info.setOnClickListener{
            openWallisonScreen()
        }

    }

    private fun openLeoScreen() {
        val intent = Intent(this, LeoScreen::class.java)
        startActivity(intent)
    }
    private fun openRooseveltScreen(){
        val intent = Intent(this, RooseveltActivity::class.java)
        startActivity(intent)
    }
    private fun openWallisonScreen(){
        val intent = Intent(this, WallisonScreen::class.java)
        startActivity(intent)
    }

}