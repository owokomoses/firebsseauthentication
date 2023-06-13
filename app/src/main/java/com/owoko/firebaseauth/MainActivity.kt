package com.owoko.firebaseauth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var Txt_gotoregister:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Txt_gotoregister=findViewById(R.id.Tv_login)

        Txt_gotoregister.setOnClickListener{
            val intent= Intent (this,RegistrationActivity::class.java)
            startActivity(intent)
        }
    }
}