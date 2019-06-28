package com.example.swoosh

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BasicActivity() {

    var player = SwooshPlayer("","")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun MenBtnClick(view: View){
        WomenBtn.isChecked = false
        OtherBtn.isChecked = false
        player.league = "men"
    }

    fun WomenBtnClick(view: View){
        MenBtn.isChecked = false
        OtherBtn.isChecked = false
        player.league = "women"
    }

    fun OtherBtnClick(view: View){
        MenBtn.isChecked = false
        WomenBtn.isChecked = false
        player.league = "other"
    }

    fun nextBtnClick(view: View){
        if (player.league != ""){
            val Skill = Intent(this,SkillActivity::class.java)
            Skill.putExtra(EXTRA_PLAYER,player)
            startActivity(Skill)
        } else Toast.makeText(this,"clicking next without selecting a league is a act of dumbness",Toast.LENGTH_SHORT).show()
    }
}
