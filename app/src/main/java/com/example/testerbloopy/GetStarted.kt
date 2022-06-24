package com.example.testerbloopy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.testerbloopy.databinding.ActivityGetStartedBinding

class GetStarted : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnGetStarted : Button
    private lateinit var binding : ActivityGetStartedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetStartedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setViews()
        setListener()
    }

    private fun setViews() {
        btnGetStarted = binding.btnGetStarted
    }

    private fun setListener() {
        btnGetStarted.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v) {
            btnGetStarted -> {
                val intent = Intent(this@GetStarted, CreateBusinessActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}