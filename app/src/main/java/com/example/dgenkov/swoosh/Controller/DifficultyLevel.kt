package com.example.dgenkov.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.dgenkov.swoosh.Model.Player
import com.example.dgenkov.swoosh.R
import com.example.dgenkov.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.difficulty_level.*

class DifficultyLevel : AppCompatActivity() {

    lateinit var player : Player

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.difficulty_level)

        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }

    }

    fun onFinnishSkillClicked(view: View) {
        if(player.skill != "") {
            val finishActivity = Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this,"Please select a skill level",Toast.LENGTH_SHORT).show()
        }

    }

    fun onBallerClicked(view: View) {
        beginnerToggleButton.isChecked = false
        player.skill = "baller"
    }
    fun onBeginnerClicked(view: View) {
        ballerToggleButton.isChecked = false
        player.skill = "beginner"
    }
}