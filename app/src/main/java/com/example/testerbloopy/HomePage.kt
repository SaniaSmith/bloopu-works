package com.example.testerbloopy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testerbloopy.databinding.ActivityHomePageBinding

class HomePage : AppCompatActivity(), View.OnClickListener {
    private lateinit var notification : ImageButton
    private lateinit var attendance : Button
    private lateinit var liveLoc : Button
    private lateinit var early : Button
    private lateinit var timeOff : Button
    private lateinit var overtime : Button
    private lateinit var paySlip : Button
    private lateinit var viewAll : TextView
    private lateinit var binding : ActivityHomePageBinding
    private var layoutManager : RecyclerView.LayoutManager? = null
    private var adapter : RecyclerView.Adapter<RecyclerHomepageAdapter.ViewHolder>? = null
    private lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setView()
        setListeners()

        layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        adapter = RecyclerHomepageAdapter()
        recyclerView.adapter = adapter
    }

    private fun setView() {
        notification = binding.notification
        attendance = binding.btnAttendance
        liveLoc = binding.btnLiveloc
        early = binding.btnEarly
        timeOff = binding.btnTimeOff
        overtime = binding.btnOvertime
        paySlip = binding.btnPaySlip
        viewAll = binding.viewAll
        recyclerView = binding.homepageRecyclerView
    }

    private fun setListeners() {
        notification.setOnClickListener(this)
        attendance.setOnClickListener(this)
        liveLoc.setOnClickListener(this)
        early.setOnClickListener(this)
        timeOff.setOnClickListener(this)
        overtime.setOnClickListener(this)
        paySlip.setOnClickListener(this)
        viewAll.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v) {
            notification -> {
                val intent = Intent(this@HomePage, NotificationActivity::class.java)
                startActivity(intent)
            }

            attendance -> {
                val intent = Intent(this@HomePage, AttendanceActivity::class.java)
                startActivity(intent)
            }

            overtime -> {
                val intent = Intent(this@HomePage, OvertimeActivity::class.java)
                startActivity(intent)
            }

            early -> {
                val intent = Intent(this@HomePage, EarlyActivity::class.java)
                startActivity(intent)
            }

            timeOff -> {
                val intent = Intent(this@HomePage, TimeOffActivity::class.java)
                startActivity(intent)
            }

            liveLoc -> {
                val intent = Intent(this@HomePage, LiveLocationActivity::class.java)
                startActivity(intent)
            }
        }
    }
}