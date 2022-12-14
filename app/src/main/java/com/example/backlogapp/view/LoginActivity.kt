package com.example.backlogapp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.backlogapp.R

class LoginActivity : AppCompatActivity() {

    lateinit var user: EditText
    lateinit var password:EditText
    lateinit var usuario: String
    lateinit var pass:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //capturar valores del activity_main.xml
        user = findViewById(R.id.username)
        password = findViewById(R.id.password)
        //convertirlos a un String
        usuario = user.text.toString()
        pass = password.text.toString()
    }

    fun accederPrincipal(view: View) {

        var intent = Intent(applicationContext,IngresoActivity::class.java)
        startActivity(intent)
    }
}