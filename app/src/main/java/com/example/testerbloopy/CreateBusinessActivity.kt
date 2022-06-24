package com.example.testerbloopy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.testerbloopy.databinding.ActivityCreateBusinessBinding

class CreateBusinessActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding : ActivityCreateBusinessBinding
    private lateinit var btnSetUp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateBusinessBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setViews()
        setListeners()
    }

    private fun setViews() {
        btnSetUp = binding.btnSetUp
    }

    private fun setListeners() {
        btnSetUp.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v) {
            btnSetUp -> {
                val intent = Intent(this@CreateBusinessActivity, HomePage::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}