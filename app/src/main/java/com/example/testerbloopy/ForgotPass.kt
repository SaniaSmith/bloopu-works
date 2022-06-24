package com.example.testerbloopy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import com.example.testerbloopy.databinding.ActivityForgotPassBinding

class ForgotPass : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnBackArrow : ImageButton
    private lateinit var btnLogin : Button
    private lateinit var binding : ActivityForgotPassBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPassBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setViews()
        setListener()
    }

    private fun setViews() {
        btnBackArrow = binding.btnBackArrow2
        btnLogin = binding.btnContinueForgotPass
    }

    private fun setListener() {
        btnBackArrow.setOnClickListener(this)
        btnLogin.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v) {
            btnBackArrow -> {
                val intent = Intent(this@ForgotPass, Login::class.java)
                startActivity(intent)
            }

            btnLogin -> {
                val intent = Intent(this@ForgotPass, ChangePass::class.java)
                startActivity(intent)
            }
        }
    }
}