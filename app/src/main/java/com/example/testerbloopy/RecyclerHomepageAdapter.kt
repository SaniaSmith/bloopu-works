package com.example.testerbloopy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerHomepageAdapter : RecyclerView.Adapter<RecyclerHomepageAdapter.ViewHolder>() {
    private var announcement = arrayOf("Announcement 1", "Announcement 2", "Announcement 3", "Announcement 4")
    private var dateAnnouncement = arrayOf("15 May 2022", "14 May 2022", "13 May 2022", "12 May 2022")

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var announcementNumber : TextView
        var dateAnnouncementNumber : TextView

        init {
            announcementNumber = itemView.findViewById(R.id.tv_announcement)
            dateAnnouncementNumber = itemView.findViewById(R.id.tv_announcementDate)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerHomepageAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.homepage_recycler_view, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerHomepageAdapter.ViewHolder, position: Int) {
        holder.announcementNumber.text = announcement[position]
        holder.dateAnnouncementNumber.text = dateAnnouncement[position]
    }

    override fun getItemCount(): Int {
        return announcement.size
    }
}