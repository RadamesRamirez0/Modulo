package com.example.modulo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.modulo.R
import com.example.modulo.activities.main.MainActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val edtUser = findViewById<EditText>(R.id.edtUser)
        val edtPass = findViewById<EditText>(R.id.edtPass)
        val btnLogin = findViewById<Button>(R.id.btnLogin)


        btnLogin.setOnClickListener()
        {
            val intent = Intent(this, MainActivity::class.java)

            val user = edtUser.text.toString()
            val pass = edtPass.text.toString()

            if(user == "admin" && pass == "1234")
            {
                startActivity(intent)
                finish()
            }


        }
    }
}