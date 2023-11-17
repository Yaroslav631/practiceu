package com.example.paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class setActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set)
    }

    fun stop(view: View) {
        val intent: Intent = Intent(this@setActivity, setActivity::class.java)
        startActivity(intent)

        this.overridePendingTransition(0, 0)
        finish()
    }
    fun play(view: View) {val intent: Intent = Intent(this@setActivity, setActivity::class.java)
        startActivity(intent)

        this.overridePendingTransition(0, 0)
    finish()}


}