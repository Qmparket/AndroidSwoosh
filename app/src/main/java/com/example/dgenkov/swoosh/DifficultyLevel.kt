package com.example.dgenkov.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class DifficultyLevel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.difficulty_level)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }
}