package com.example.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BasicActivity : AppCompatActivity() {

    val logMessage = "LifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(logMessage,"${javaClass.simpleName} OnCreate")

    }
    override fun onStart() {
        Log.d(logMessage,"${javaClass.simpleName} OnStart")
        super.onStart()
    }
    override fun onResume() {
        Log.d(logMessage,"${javaClass.simpleName} OnResume")
        super.onResume()
    }
    override fun onRestart() {
        Log.d(logMessage,"${javaClass.simpleName} OnRestart")
        super.onRestart()
    }
    override fun onPause() {
        Log.d(logMessage,"${javaClass.simpleName} OnPause")
        super.onPause()
    }
    override fun onStop() {
        Log.d(logMessage,"${javaClass.simpleName} OnStop")
        super.onStop()
    }
}
