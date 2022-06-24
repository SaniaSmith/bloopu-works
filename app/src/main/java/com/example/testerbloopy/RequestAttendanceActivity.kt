package com.example.testerbloopy

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import com.example.testerbloopy.databinding.ActivityRequestAttendanceBinding
import java.text.SimpleDateFormat
import java.util.*

class RequestAttendanceActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnBack: ImageButton
    private lateinit var btnDate: Button
    private lateinit var btnReq: Button
    private lateinit var btnCancel: Button
    private lateinit var binding : ActivityRequestAttendanceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRequestAttendanceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setViews()
        setListeners()
    }

    private fun setViews() {
        btnBack = binding.btnBackArrow5
        btnDate = binding.btnDateDropdown
        btnReq = binding.btnReqAttendance
        btnCancel = binding.btnCancel
    }

    private fun setListeners() {
        btnBack.setOnClickListener(this)
        btnDate.setOnClickListener(this)
        btnReq.setOnClickListener(this)
        btnCancel.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v) {
            btnBack -> {
                val intent = Intent(this@RequestAttendanceActivity, AttendanceActivity::class.java)
                startActivity(intent)
            }

            btnDate -> {
                val myCalender = Calendar.getInstance()

                val datePicker =
                    DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                        myCalender.set(Calendar.YEAR, year)
                        myCalender.set(Calendar.MONDAY, month)
                        myCalender.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                        updateLable(myCalender)
                    }

                DatePickerDialog(
                    this,
                    datePicker,
                    myCalender.get(Calendar.YEAR),
                    myCalender.get(Calendar.MONTH),
                    myCalender.get(
                        Calendar.DAY_OF_MONTH
                    )
                ).show()
            }

            btnReq -> {

            }

            btnCancel -> {
                val intent = Intent(this@RequestAttendanceActivity, AttendanceActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }


    private fun updateLable(myCalender: Calendar) {
        val myFormat = "d MMMM yyyy"
        val sdf = SimpleDateFormat(myFormat)
        btnDate.setText(sdf.format(myCalender.time))
    }
}