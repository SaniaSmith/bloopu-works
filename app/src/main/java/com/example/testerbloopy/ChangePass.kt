package com.example.testerbloopy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.testerbloopy.databinding.ActivityChangePassBinding

class ChangePass : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnChangeLogin : Button
    private lateinit var binding : ActivityChangePassBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChangePassBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setViews()
        setListener()
    }

    private fun setViews() {
        btnChangeLogin = binding.btnLoginChangePass
    }

    private fun setListener() {
        btnChangeLogin.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v) {
            btnChangeLogin -> {
                val intent = Intent(this@ChangePass, HomePage::class.java)
                startActivity(intent)
            }
        }
    }
}