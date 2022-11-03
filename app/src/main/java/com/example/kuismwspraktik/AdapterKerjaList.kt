package com.example.kuismwspraktik

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterKerjaList(val kerjaList: ArrayList<DataListKerja>): RecyclerView.Adapter<AdapterKerjaList.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.fetch_pengerjaan_list, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = kerjaList[position]

        holder.nama.text = currentItem.nama
        holder.title.text = currentItem.title
        holder.desc.text = currentItem.desc
        holder.count.text = currentItem.count
        holder.time.text = currentItem.time

    }

    override fun getItemCount(): Int {
        return kerjaList.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val nama: TextView = itemView.findViewById(R.id.txtNama)
        val title: TextView = itemView.findViewById(R.id.txtTitle)
        val desc: TextView = itemView.findViewById(R.id.txtDesc)
        val count: TextView = itemView.findViewById(R.id.txtCount)
        val time: TextView = itemView.findViewById(R.id.txtTime)
    }
}