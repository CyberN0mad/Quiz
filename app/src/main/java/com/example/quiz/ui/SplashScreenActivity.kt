package com.example.quiz.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import com.example.myquizapp.R

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar?.hide()
        goToMain();
    }

    private fun goToMain() {
        Handler().postDelayed({
            val mIntent = Intent(this, MainActivity::class.java)
            startActivity(mIntent)
            finish()
        }, 3000)
    }
}