package com.mohetabsem.hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log.wtf
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.concurrent.schedule
import kotlin.concurrent.timerTask

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        fun roll(){ // this is change
            var dice  = (1 until 7).shuffled().last()
            when(dice){
                1-> run {animationView.setAnimation(R.raw.one)}
                2->run {animationView.setAnimation(R.raw.tow) }
                3->run {animationView.setAnimation(R.raw.three)}
                4->run {animationView.setAnimation(R.raw.three)}
                5->run {animationView.setAnimation(R.raw.three)}
                6->run {animationView.setAnimation(R.raw.three)}
            }


            Toast.makeText(this,"$dice",Toast.LENGTH_SHORT)

            //Timer("SettingUp", true).schedule(500) {num.playAnimation()}
            animationView.playAnimation()
            Handler(Looper.getMainLooper()).postDelayed({
                when(dice){
                    1-> run { num.setAnimation(R.raw.n1);}
                    2->run { num.setAnimation(R.raw.n2);}
                    3->run { num.setAnimation(R.raw.n3);}
                    4->run { num.setAnimation(R.raw.n4);}
                    5->run { num.setAnimation(R.raw.n5);}
                    6->run {num.setAnimation(R.raw.n6);}
                }
                num.playAnimation()
            }, 1000)

            wtf("@@","${dice}")
        }
        rool.setOnClickListener {
            roll()

        }
    }
}
