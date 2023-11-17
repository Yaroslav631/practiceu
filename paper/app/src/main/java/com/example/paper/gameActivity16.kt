package com.example.paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class gameActivity16 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game16)
    }

    fun ffrf(view: View) {
        val intent: Intent = Intent(this@gameActivity16, gameActivity17::class.java)
        startActivity(intent)
        this.overridePendingTransition(0, 0)
    }


}