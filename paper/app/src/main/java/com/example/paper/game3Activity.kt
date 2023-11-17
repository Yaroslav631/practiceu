package com.example.paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class game3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game3)



        }

    fun asd(view: View) {
        val intent: Intent = Intent(this@game3Activity, gameActivity4::class.java)
        startActivity(intent)
        this.overridePendingTransition(0, 0)
    }
}
