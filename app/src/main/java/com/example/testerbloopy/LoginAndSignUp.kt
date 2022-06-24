package com.example.testerbloopy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.testerbloopy.databinding.ActivityLoginAndSignUpBinding

class LoginAndSignUp : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnGetStartedSignUp: Button
    private lateinit var btnContinue: Button
    private lateinit var binding : ActivityLoginAndSignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginAndSignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setViews()
        setListener()
    }

    private fun setViews() {
        btnGetStartedSignUp = binding.btnGetStartedSignUp
        btnContinue = binding.btnContinue
    }

    private fun setListener() {
        btnGetStartedSignUp.setOnClickListener(this)
        btnContinue.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v) {
            btnGetStartedSignUp -> {
                val intentGetStarted = Intent(this@LoginAndSignUp, SignUp::class.java)
                startActivity(intentGetStarted)
            }

            btnContinue -> {
                val intentContinue = Intent(this@LoginAndSignUp, Login::class.java)
                startActivity(intentContinue)
            }
        }
    }
}