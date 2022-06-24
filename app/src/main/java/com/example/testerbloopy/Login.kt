package com.example.testerbloopy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import com.example.testerbloopy.databinding.ActivityLoginBinding

class Login : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnBackArrow : ImageButton
    private lateinit var btnForgotPass : Button
    private lateinit var btnLoginLogin : Button
    private lateinit var btnSignUpLogin : Button
    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setViews()
        setListener()
    }

    private fun setViews() {
        btnBackArrow = binding.btnBackArrow3
        btnForgotPass = binding.btnForgotPass
        btnLoginLogin = binding.btnLoginLogin
        btnSignUpLogin = binding.btnSignUpLogin
    }

    private fun setListener() {
        btnBackArrow.setOnClickListener(this)
        btnForgotPass.setOnClickListener(this)
        btnLoginLogin.setOnClickListener(this)
        btnSignUpLogin.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v) {
            btnBackArrow -> {
                val intent = Intent(this@Login, LoginAndSignUp::class.java)
                startActivity(intent)
                finish()
            }

            btnForgotPass -> {
                val intent = Intent(this@Login, ForgotPass::class.java)
                startActivity(intent)
            }

            btnLoginLogin -> {
                val intent = Intent(this@Login, ChooseBusinessActivity::class.java)
                startActivity(intent)
                finish()
            }

            btnSignUpLogin -> {
                val intent = Intent(this@Login, SignUp::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}