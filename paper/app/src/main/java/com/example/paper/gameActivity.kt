package com.example.paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class gameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
    }

    fun ery(view: View) {
        val intent: Intent = Intent(this@gameActivity, game2Activity::class.java)
        startActivity(intent)
        finish()
    }
}