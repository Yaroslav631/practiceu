package com.example.paper

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTheme(R.style.Theme_Paper_Splash)
        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            val scaleX = ObjectAnimator.ofFloat(button, View.SCALE_X, 1.3f)
            val scaleY = ObjectAnimator.ofFloat(button, View.SCALE_Y, 1.3f)
            scaleX.duration = 200
            scaleY.duration = 200

            val scaleDownX = ObjectAnimator.ofFloat(button, View.SCALE_X, 1.0f)
            val scaleDownY = ObjectAnimator.ofFloat(button, View.SCALE_Y, 1.0f)
            scaleDownX.duration = 500
            scaleDownY.duration = 500

            val scaleDown = AnimatorSet()
            scaleDown.play(scaleDownX).with(scaleDownY)

            val scaleUp = AnimatorSet()
            scaleUp.play(scaleX).with(scaleY)

            scaleUp.start()
            scaleUp.addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    val intent: Intent = Intent(this@MainActivity, gameActivity::class.java)
                    startActivity(intent)
                    finish()




                }
            })
        }

    }

    fun btb(view: View) {
        finishAndRemoveTask();
    }

    fun bby(view: View) {
        val intent: Intent = Intent(this@MainActivity, setActivity::class.java)
        startActivity(intent)

        this.overridePendingTransition(0, 0)

    }



}