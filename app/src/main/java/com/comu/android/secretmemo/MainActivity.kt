package com.comu.android.secretmemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText1 = findViewById<EditText>(R.id.Email)
        val editText2 = findViewById<EditText>(R.id.Password)

        findViewById<Button>(R.id.button).setOnClickListener {
            val emailText = editText1.text.toString()
            val passwordText = editText2.text.toString()

            if (emailText == "sjjoseph106@gmail.com" && passwordText == "3242") {
                Log.d("비밀메모앱", "통과!")
            } else if (emailText != "sjjoseph106@gmail.com" && passwordText == "3242") {
                Log.d("비밀메모앱", "이메일이 틀렸어요.")
            } else if (emailText == "sjjoseph106@gmail.com" && passwordText != "3242") {
                Log.d("비밀메모앱", "비밀번호가 틀렸어요.")
            } else {
                Log.d("비밀메모앱", "이메일과 비밀번호가 틀렸어요.")
            }
        }

    }
}