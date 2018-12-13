package com.example.dgenkov.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_desired_league.*

class DesiredLeagueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desired_league)

        nextButton.setOnClickListener {
            val skillIntent = Intent(this,DifficultyLevel::class.java)
            startActivity(skillIntent)
        }
    }


}
