package com.example.paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class gameActivity11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game11)
    }

    fun oiy(view: View) { val intent: Intent = Intent(this@gameActivity11, gameActivity12::class.java)
        startActivity(intent)
        this.overridePendingTransition(0, 0)}
}