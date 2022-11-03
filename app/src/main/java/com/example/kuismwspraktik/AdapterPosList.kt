package com.example.kuismwspraktik

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterPosList(val postList: ArrayList<DataListPos>): RecyclerView.Adapter<AdapterPosList.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.fetch_pos_list, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = postList[position]

        holder.name.text = currentItem.name
        holder.desc.text = currentItem.desc
        holder.count.text = currentItem.count

    }

    override fun getItemCount(): Int {
        return postList.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.txtName)
        val desc: TextView = itemView.findViewById(R.id.txtDesc)
        val count: TextView = itemView.findViewById(R.id.txtCount)
    }
}