package com.example.kuismwspraktik

import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PengerjaanFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var dataListKerja : ArrayList<DataListKerja>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pengerjaan, container, false)
        recyclerView = view.findViewById(R.id.recyclerViewPengerjaan)
        dataListKerja = ArrayList<DataListKerja>()
        val nama = arrayOf(
            "Jagad Raya",
            "Jagad Raya",
            "Jagad Raya",
            "Jagad Raya",
            "Jagad Raya",
            "Jagad Raya",
            "Jagad Raya",
            "Jagad Raya",
            "Jagad Raya",
            "Jagad Raya",
        )

        val title = arrayOf(
            "Title lorem ipsum dolor sit amet",
            "Title lorem ipsum dolor sit amet",
            "Title lorem ipsum dolor sit amet",
            "Title lorem ipsum dolor sit amet",
            "Title lorem ipsum dolor sit amet",
            "Title lorem ipsum dolor sit amet",
            "Title lorem ipsum dolor sit amet",
            "Title lorem ipsum dolor sit amet",
            "Title lorem ipsum dolor sit amet",
            "Title lorem ipsum dolor sit amet",
        )

        val desc = arrayOf(
            "1 pertanyaan",
            "2 pertanyaan",
            "3 pertanyaan",
            "4 pertanyaan",
            "5 pertanyaan",
            "6 pertanyaan",
            "7 pertanyaan",
            "8 pertanyaan",
            "9 pertanyaan",
            "10 pertanyaan",
        )

        val count = arrayOf(
            "1 POS",
            "2 POS",
            "3 POS",
            "4 POS",
            "5 POS",
            "6 POS",
            "7 POS",
            "8 POS",
            "9 POS",
            "10 POS",
        )

        val time = arrayOf(
            "1 jam yang lalu",
            "2 jam yang lalu",
            "3 jam yang lalu",
            "4 jam yang lalu",
            "5 jam yang lalu",
            "6 jam yang lalu",
            "7 jam yang lalu",
            "8 jam yang lalu",
            "9 jam yang lalu",
            "10 jam yang lalu",
        )

        for(i in count.indices){
            dataListKerja.add(
                DataListKerja(
                    nama[i],
                    title[i],
                    desc[i],
                    count[i],
                    time[i]
                )
            )
            recyclerView.layoutManager = LinearLayoutManager(context)
            recyclerView.adapter = AdapterKerjaList(dataListKerja)
        }

        return view
    }
}