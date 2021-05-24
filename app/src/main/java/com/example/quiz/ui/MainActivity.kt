package com.example.quiz.ui

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.myquizapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)


        viewpager2.adapter = ViewPagerAdapter(this)
        viewpager2.isUserInputEnabled = false

        bottom_nav_view.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.fragment_home -> {
                    viewpager2.currentItem = 0
                }
                R.id.fragment_dashboard -> {
                    viewpager2.currentItem = 1
                }
                R.id.fragment_settings -> {
                    viewpager2.currentItem = 2
                }
                else -> viewpager2.currentItem = 0
            }
            false
        }

    }
}

