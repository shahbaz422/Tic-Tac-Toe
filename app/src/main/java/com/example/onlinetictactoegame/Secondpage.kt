package com.example.onlinetictactoegame

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.onlinetictactoegame.MainActivity
import kotlinx.android.synthetic.main.activity_secondpage.*

var Online = true;

class SecondPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondpage)
        buttonOnline.setOnClickListener {
            startActivity(Intent(this, CodeActivity::class.java))
            singleUser = true;
            Online = true;
        }
        buttonOffline.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            singleUser = false;
            Online = false;
        }
    }
}
