package com.example.testerbloopy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import com.example.testerbloopy.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnBackArrow : ImageButton
    private lateinit var edtInputNama : EditText
    private lateinit var edtInputEmail : EditText
    private lateinit var edtInputPass : EditText
    private lateinit var edtConfirmPass : EditText
    private lateinit var btnRegis : Button
    private lateinit var btnLogIn : Button
    private lateinit var binding : ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setViews()
        setListener()
    }

    private fun setViews() {
        btnBackArrow = binding.btnBackArrow
        edtInputNama = binding.inputUser
        edtInputEmail = binding.inputEmail
        edtInputPass = binding.inputPass
        edtConfirmPass = binding.confirmPass
        btnRegis = binding.btnRegis
        btnLogIn = binding.btnLogin
    }

    private fun setListener() {
        btnBackArrow.setOnClickListener(this)
        btnRegis.setOnClickListener(this)
        btnLogIn.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v) {
            btnBackArrow -> {
                val intent = Intent(this@SignUp, LoginAndSignUp::class.java)
                startActivity(intent)
                finish()
            }

            btnRegis -> {
                val intent = Intent(this@SignUp, EmailVerification::class.java)
                startActivity(intent)
                finish()
            }

            btnLogIn -> {
                val intent = Intent(this@SignUp, Login::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}