package com.example.kuismwspraktik

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class UserFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var dataListUser : ArrayList<DataListUser>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_user, container, false)

        recyclerView = view.findViewById(R.id.recyclerViewUser)
        dataListUser = ArrayList<DataListUser>()
        val name = arrayOf(
            "lorem ipsum dolor 1",
            "lorem ipsum dolor 2",
            "lorem ipsum dolor 3",
            "lorem ipsum dolor 4",
            "lorem ipsum dolor 5",
            "lorem ipsum dolor 6",
            "lorem ipsum dolor 7",
            "lorem ipsum dolor 8",
            "lorem ipsum dolor 9",
            "lorem ipsum dolor 10",
        )

        val email = arrayOf(
            "lorem1@gmal.com",
            "lorem2@gmal.com",
            "lorem3@gmal.com",
            "lorem4@gmal.com",
            "lorem5@gmal.com",
            "lorem6@gmal.com",
            "lorem7@gmal.com",
            "lorem8@gmal.com",
            "lorem9@gmal.com",
            "lorem10@gmal.com",
        )

        val image = arrayOf(
            R.drawable.person1,
            R.drawable.person2,
            R.drawable.person3,
            R.drawable.person4,
            R.drawable.person5,
            R.drawable.person6,
            R.drawable.person7,
            R.drawable.person8,
            R.drawable.person9,
            R.drawable.person10,
        )

        for(i in name.indices){
            dataListUser.add(
                DataListUser(
                    image[i],
                    email[i],
                    name[i]
                )
            )
            recyclerView.layoutManager = LinearLayoutManager(context)
            recyclerView.adapter = AdapterListUser(dataListUser)
        }

        return view
    }
}