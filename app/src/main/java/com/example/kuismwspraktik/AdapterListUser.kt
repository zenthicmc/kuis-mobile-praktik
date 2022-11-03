package com.example.kuismwspraktik

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterListUser(val userList: ArrayList<DataListUser>): RecyclerView.Adapter<AdapterListUser.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.fetch_user_list, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = userList[position]

        holder.photoProfile.setImageResource(currentItem.photo_profile)
        holder.name.text = currentItem.name
        holder.email.text = currentItem.email

    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val photoProfile: ImageView = itemView.findViewById(R.id.photoProfile)
        val name: TextView = itemView.findViewById(R.id.txtName)
        val email: TextView = itemView.findViewById(R.id.txtEmail)
    }
}