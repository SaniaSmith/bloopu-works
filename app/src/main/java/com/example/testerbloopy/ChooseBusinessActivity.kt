package com.example.testerbloopy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import com.example.testerbloopy.databinding.ActivityChooseBusinessBinding

class ChooseBusinessActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding : ActivityChooseBusinessBinding
    private lateinit var btnCreate : Button
    private lateinit var business1 : RelativeLayout
    private lateinit var business2 : RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseBusinessBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setViews()
        setListeners()
    }

    private fun setViews() {
        btnCreate = binding.btnCreateMore
        business1 = binding.business1
        business2 = binding.business2
    }

    private fun setListeners() {
        btnCreate.setOnClickListener(this)
        business1.setOnClickListener(this)
        business2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v) {
            btnCreate -> {
                val intent = Intent(this@ChooseBusinessActivity, CreateBusinessActivity::class.java)
                startActivity(intent)
            }

            business1 -> {
                val intent = Intent(this@ChooseBusinessActivity, HomePage::class.java)
                startActivity(intent)
            }

            business2 -> {
                val intent = Intent(this@ChooseBusinessActivity, HomePage::class.java)
                startActivity(intent)
            }
        }
    }
}