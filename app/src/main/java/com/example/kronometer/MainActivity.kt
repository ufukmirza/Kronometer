package com.example.kronometer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var stoptime : Long= 0

    buttonstart.setOnClickListener {

kronometre.base=SystemClock.elapsedRealtime()+stoptime
        kronometre.start()
        buttonstart.visibility= View.GONE
        buttonpause.visibility=View.VISIBLE


    }

        buttonpause.setOnClickListener {

           stoptime=kronometre.base-SystemClock.elapsedRealtime()
            kronometre.stop()
            buttonpause.visibility= View.GONE
            buttonstart.visibility=View.VISIBLE


        }

        buttonreset.setOnClickListener {

            kronometre.base=SystemClock.elapsedRealtime()
            kronometre.stop()
            buttonpause.visibility= View.GONE
            buttonstart.visibility=View.VISIBLE


        }


    }
}