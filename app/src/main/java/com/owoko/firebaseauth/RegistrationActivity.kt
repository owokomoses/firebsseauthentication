package com.owoko.firebaseauth

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity : AppCompatActivity() {
    lateinit var Txt_gotocreate:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        Txt_gotocreate=findViewById(R.id.textView2)

        Txt_gotocreate.setOnClickListener{
            val intent= Intent (this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
