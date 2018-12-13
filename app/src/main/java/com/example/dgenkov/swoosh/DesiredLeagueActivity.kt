package com.example.dgenkov.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_desired_league.*

class DesiredLeagueActivity : AppCompatActivity() {

    var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desired_league)

        nextButton.setOnClickListener {
            if (selectedLeague != "") {
                val skillIntent = Intent(this,DifficultyLevel::class.java)
                skillIntent.putExtra(EXTRA_LEAGUE,selectedLeague)
                startActivity(skillIntent)
            } else {
                Toast.makeText(this,"Please select a league.",Toast.LENGTH_SHORT).show()

            }

        }
    }

    fun onMensClicked(view: View) {
        womensButton.isChecked = false
        coedButton.isChecked = false
        selectedLeague = "mens"
    }
    fun onWomensClicked(view: View) {
        mensButton.isChecked = false
        coedButton.isChecked = false
        selectedLeague = "womens"
    }
    fun onCoedClicked(view: View) {
        womensButton.isChecked = false
        mensButton.isChecked = false
        selectedLeague = "coed"
    }





}
