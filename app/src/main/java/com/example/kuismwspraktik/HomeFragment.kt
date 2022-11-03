package com.example.kuismwspraktik

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {
    private lateinit var txtNama: TextView
    private lateinit var recyclerView: RecyclerView
    private lateinit var dataListPos : ArrayList<DataListPos>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        txtNama = view.findViewById(R.id.txtNama)
        val nama = arguments?.getString("nama")

        txtNama.text = nama

        recyclerView = view.findViewById(R.id.recyclerViewPos)
        dataListPos = ArrayList<DataListPos>()
        val name = arrayOf(
            "lorem ipsum dolor sit amet",
            "lorem ipsum dolor sit amet",
            "lorem ipsum dolor sit amet",
            "lorem ipsum dolor sit amet",
            "lorem ipsum dolor sit amet",
            "lorem ipsum dolor sit amet",
            "lorem ipsum dolor sit amet",
            "lorem ipsum dolor sit amet",
            "lorem ipsum dolor sit amet",
            "lorem ipsum dolor sit amet",
        )

        val desc = arrayOf(
            "Description lorem ipsum dolor sit amet",
            "Description lorem ipsum dolor sit amet",
            "Description lorem ipsum dolor sit amet",
            "Description lorem ipsum dolor sit amet",
            "Description lorem ipsum dolor sit amet",
            "Description lorem ipsum dolor sit amet",
            "Description lorem ipsum dolor sit amet",
            "Description lorem ipsum dolor sit amet",
            "Description lorem ipsum dolor sit amet",
            "Description lorem ipsum dolor sit amet",
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

        for(i in count.indices){
            dataListPos.add(
                DataListPos(
                    name[i],
                    desc[i],
                    count[i]
                )
            )
            recyclerView.layoutManager = LinearLayoutManager(context)
            recyclerView.adapter = AdapterPosList(dataListPos)
        }

        return  view
    }
}