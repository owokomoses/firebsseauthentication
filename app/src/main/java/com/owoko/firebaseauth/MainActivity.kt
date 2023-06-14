package com.owoko.firebaseauth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    lateinit var Txt_gotoregister:TextView
    lateinit var edtloginemail:EditText
    lateinit var edtloginpassword:EditText
    lateinit var btnlogin:Button
    lateinit var auth:FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Txt_gotoregister = findViewById(R.id.Tv_login)
        edtloginemail = findViewById(R.id.edt_login_email)
        edtloginpassword = findViewById(R.id.edit_login_Password)
        btnlogin = findViewById(R.id.btn_login)
        auth = FirebaseAuth.getInstance()


        Txt_gotoregister.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }

        btnlogin.setOnClickListener {
            login()
        }
    }
    private fun login(){
        val email=edtloginemail.text.toString()
        val pass= edtloginpassword.text.toString()
        auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(this){
           if (it.isSuccessful){
               Toast.makeText(this,"Successfully Logged in",Toast.LENGTH_LONG).show()
           }else{
               Toast.makeText(this,"Login failed",Toast.LENGTH_LONG).show()
           }
        }
    }
    }
