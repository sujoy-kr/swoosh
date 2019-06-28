package com.example.swoosh

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BasicActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        GetStarted.setOnClickListener {
            val leagueactivitypage = Intent(this,LeagueActivity::class.java)
            startActivity(leagueactivitypage)
        }
    }
}
