package com.owoko.firebaseauth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var Txt_gotoregister:TextView
    lateinit var edtloginemail:EditText
    lateinit var edtloginpassword:EditText
    lateinit var btnlogin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Txt_gotoregister=findViewById(R.id.Tv_login)
        edtloginemail=findViewById(R.id.edt_login_email)
        edtloginpassword=findViewById(R.id.edit_login_Password)
        btnlogin=findViewById(R.id.btn_login)

        Txt_gotoregister.setOnClickListener{
            val intent= Intent (this,RegistrationActivity::class.java)
            startActivity(intent)
        }
        edtloginemail.setOnClickListener {
            Intent (this,MainActivity::class.java)
        }
        edtloginpassword.setOnClickListener {
            Intent (this,MainActivity::class.java)
        }
        btnlogin.setOnClickListener {
            Intent (this,MainActivity::class.java)
        }
    }
}