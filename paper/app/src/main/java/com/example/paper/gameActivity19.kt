package com.example.paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class gameActivity19 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game19)
    }

    fun tytyty(view: View) {  val intent: Intent = Intent(this@gameActivity19, gameActivity20::class.java)
        startActivity(intent)
        this.overridePendingTransition(0, 0)}
}