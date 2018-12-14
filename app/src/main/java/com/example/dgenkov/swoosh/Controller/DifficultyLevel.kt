package com.example.dgenkov.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.dgenkov.swoosh.Utilities.EXTRA_LEAGUE
import com.example.dgenkov.swoosh.R
import com.example.dgenkov.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.difficulty_level.*

class DifficultyLevel : AppCompatActivity() {

    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.difficulty_level)

        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onFinnishSkillClicked(view: View) {
        if(skill != "") {
            val finishActivity = Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILL,skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this,"Please select a skill level",Toast.LENGTH_SHORT).show()
        }

    }

    fun onBallerClicked(view: View) {
        beginnerToggleButton.isChecked = false
        skill = "baller"
    }
    fun onBeginnerClicked(view: View) {
        ballerToggleButton.isChecked = false
        skill = "beginner"
    }
}