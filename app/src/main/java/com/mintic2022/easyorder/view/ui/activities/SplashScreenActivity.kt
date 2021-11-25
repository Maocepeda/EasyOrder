package com.mintic2022.easyorder.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.mintic2022.easyorder.R
import com.mintic2022.easyorder.databinding.ActivitySplashScreenBinding


class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val animation = AnimationUtils.loadAnimation(this, R.anim.animation)
        binding.imgSplashScreen.startAnimation(animation)
        val intent = Intent(this, MainActivity::class.java)

        animation.setAnimationListener(object: Animation.AnimationListener{
            override fun onAnimationStart(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                startActivity(intent)
                finish()
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }

        })
    }
}