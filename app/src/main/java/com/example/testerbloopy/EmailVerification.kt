package com.example.testerbloopy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import com.example.testerbloopy.databinding.ActivityEmailVerificationBinding

class EmailVerification : AppCompatActivity(), View.OnClickListener {
    private lateinit var Back : ImageButton
    private lateinit var Login : Button
    private lateinit var binding : ActivityEmailVerificationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmailVerificationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setViews()
        setListeners()
    }

    private fun setViews() {
        Back = binding.btnBackArrowEmail
        Login = binding.btnLoginFromVerification
    }

    private fun setListeners() {
        Back.setOnClickListener(this)
        Login.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v) {
            Back -> {
                val intent = Intent(this@EmailVerification, SignUp::class.java)
                startActivity(intent)
                finish()
            }

            Login -> {
                val intent = Intent(this@EmailVerification, GetStarted::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}