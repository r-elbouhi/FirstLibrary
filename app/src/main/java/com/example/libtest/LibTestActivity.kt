package com.example.libtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LibTestActivity : AppCompatActivity() {

    companion object{

        fun start(appCompatActivity: AppCompatActivity){
            val intent = Intent(appCompatActivity, LibTestActivity::class.java)
            appCompatActivity.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
