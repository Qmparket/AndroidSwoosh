package com.example.dgenkov.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.dgenkov.swoosh.Model.Player
import com.example.dgenkov.swoosh.R
import com.example.dgenkov.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_desired_league.*

class DesiredLeagueActivity : AppCompatActivity() {

    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desired_league)

        nextButton.setOnClickListener {
            if (player.league != "") {
                val skillIntent = Intent(this, DifficultyLevel::class.java)
                skillIntent.putExtra(EXTRA_PLAYER,player)
                startActivity(skillIntent)
            } else {
                Toast.makeText(this,"Please select a league.",Toast.LENGTH_SHORT).show()

            }

        }
    }

    fun onMensClicked(view: View) {
        womensButton.isChecked = false
        coedButton.isChecked = false
        player.league = "mens"
    }
    fun onWomensClicked(view: View) {
        mensButton.isChecked = false
        coedButton.isChecked = false
        player.league = "womens"
    }
    fun onCoedClicked(view: View) {
        womensButton.isChecked = false
        mensButton.isChecked = false
        player.league = "co-ed"
    }





}
