package com.mohetabsem.hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.wtf
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        fun roll(){
            var dice  = (1 until 7).shuffled().last()
            when(dice){
                1->animationView.setAnimation(R.raw.one)
                2->animationView.setAnimation(R.raw.tow)
                3->animationView.setAnimation(R.raw.three)
                4->animationView.setAnimation(R.raw.fure)
                5->animationView.setAnimation(R.raw.five)
                6->animationView.setAnimation(R.raw.six)
            }
            Toast.makeText(this,"$dice",Toast.LENGTH_SHORT)
            animationView.playAnimation()
            wtf("@@","${dice}")
        }
        rool.setOnClickListener {
            roll()
        }
    }
}
