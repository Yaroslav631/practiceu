package com.example.paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class gameActivity15 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game15)
    }

    fun ret(view: View) { val intent: Intent = Intent(this@gameActivity15, gameActivity16::class.java)
        startActivity(intent)
        this.overridePendingTransition(0, 0)}
}