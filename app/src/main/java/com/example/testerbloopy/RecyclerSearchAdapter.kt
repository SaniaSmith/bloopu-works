package com.example.testerbloopy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerSearchAdapter : RecyclerView.Adapter<RecyclerSearchAdapter.ViewHolder>() {
    private var reason = arrayOf("Acara Keluarga", "Cuti Tahunan", "Keperluan Mendesak", "Keperluan Mendadak")
    private var time = arrayOf("15 May 2022", "30 April 2022", "17 Maret 2022", "28 Februari 2022")

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var timeOffReason : TextView
        var timeOffDate : TextView

        init {
            timeOffReason = itemView.findViewById(R.id.tv_search_timeOff_reason)
            timeOffDate = itemView.findViewById(R.id.tv_search_timeOff_date)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerSearchAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.search_recycler__view_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerSearchAdapter.ViewHolder, position: Int) {
        holder.timeOffReason.text = reason[position]
        holder.timeOffDate.text = time[position]
    }

    override fun getItemCount(): Int {
        return reason.size
    }
}