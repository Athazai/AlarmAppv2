package com.athzaq.alarmapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.athzaq.alarmapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewSetOneTimeAlarm.setOnClickListener {
            startActivity(Intent(this, OneTimeAlarmActivity::class.java))
        }
        binding.viewSetRepeatingAlarm.setOnClickListener {
            startActivity(Intent(this, RepeatingAlarmActivity::class.java))
        }
    }
}