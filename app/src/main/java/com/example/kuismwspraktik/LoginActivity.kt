package com.example.kuismwspraktik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    private lateinit var inputEmail : EditText
    private lateinit var inputNama : EditText
    private lateinit var btnLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        inputEmail = findViewById(R.id.inputEmail)
        inputNama = findViewById(R.id.inputNama)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val nama = inputNama.text.toString().trim()
            val email = inputEmail.text.toString().trim()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("email", email)
            intent.putExtra("nama", nama)
            startActivity(intent)
        }
    }
}