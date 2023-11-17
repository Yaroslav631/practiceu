package com.example.paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class gameActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game9)
    }

    fun trt(view: View) {  val intent: Intent = Intent(this@gameActivity9, gameActivity10::class.java)
        startActivity(intent)
        this.overridePendingTransition(0, 0)}
}