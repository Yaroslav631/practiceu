package com.example.paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class gameActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game7)




}

    fun tu(view: View) {
        val intent: Intent = Intent(this@gameActivity7, gameActivity8::class.java)
        startActivity(intent)
        this.overridePendingTransition(0, 0)
    }
}