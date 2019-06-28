package com.example.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BasicActivity() {

lateinit var player : SwooshPlayer

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra<SwooshPlayer>(EXTRA_PLAYER)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun BeginnerBtnClick(view: View){
        BallerBtn.isChecked = false
        player.skill = "beginner"
    }

    fun BallerBtnClick(view: View){
        BeginnerBtn.isChecked = false
        player.skill = "baller"
    }

    fun FinishBtnClick(view: View){
        if (player.skill != ""){
            val finishPage = Intent(this,FinishActivity::class.java)
            finishPage.putExtra(EXTRA_PLAYER,player)
            startActivity(finishPage)
        } else {
            Toast.makeText(this,"please select a skill level",Toast.LENGTH_SHORT).show()
        }
    }
}
