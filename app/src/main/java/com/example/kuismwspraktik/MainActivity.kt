package com.example.kuismwspraktik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNav: BottomNavigationView
    private lateinit var fragment: FragmentContainerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav = findViewById(R.id.bottom_nav)
        fragment = findViewById(R.id.fragment_container)

        val email = intent.getStringExtra("email")
        val nama = intent.getStringExtra("nama")

        val bundle = Bundle()
        bundle.putString("email", email)
        bundle.putString("nama", nama)

        val default = HomeFragment()
        default.arguments = bundle

        replaceFragment(default)

        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> {
                    replaceFragment(HomeFragment())
                }
                R.id.nav_pengerjaan -> {
                    replaceFragment(PengerjaanFragment())
                }
                R.id.nav_user -> {
                    replaceFragment(UserFragment())
                }
                R.id.nav_setting -> {
                    replaceFragment(SettingsFragment())
                }
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit()
    }
}