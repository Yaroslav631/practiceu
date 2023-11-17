package com.example.paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class game2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game2)


    }

    fun ery(view: View) {
        val intent: Intent = Intent(this@game2Activity, game3Activity::class.java)
        startActivity(intent)
        this.overridePendingTransition(0, 0)
     finish()
    }

    fun bbt(view: View) {
        val intent: Intent = Intent(this@game2Activity, game3Activity::class.java)
        startActivity(intent)
        this.overridePendingTransition(0, 0)
    }
}