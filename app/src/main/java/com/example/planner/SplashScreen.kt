package com.example.planner

import android.os.Bundle
import android.os.PersistableBundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.splash_screen)

        val topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation)
        val middleAnimation = AnimationUtils.loadAnimation(this,R.anim.middle_animation)
        val bottonAnimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation)

        
    }
}