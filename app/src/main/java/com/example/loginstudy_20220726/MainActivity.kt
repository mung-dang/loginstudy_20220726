package com.example.loginstudy_20220726

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signUpBtn.setOnClickListener {
//            Toast.makeText(this, "회원가입 버튼 클릭", Toast.LENGTH_SHORT).show()
//            emailTxt.text = "아이디"

            emailEdt.setText("아이디")
        }

        loginBtn.setOnClickListener {
            Log.d("로그인버튼", "클릭")
//            emailTxt.text = passwordTxt.text
            val email = emailEdt.text
            val password = passwordEdt.text

            Toast.makeText(this, email, Toast.LENGTH_SHORT).show()
        }
    }
}