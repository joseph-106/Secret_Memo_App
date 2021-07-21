package com.comu.android.secretmemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.Password)

        findViewById<Button>(R.id.button).setOnClickListener {
            val passwordText = editText.text.toString()
            val intent = Intent(this, MemoActivity::class.java)

            if (passwordText != "3242") {
                Log.d("비밀메모앱", "비밀번호가 틀렸어요.")
                findViewById<TextView>(R.id.textView).text = "비밀번호가 틀렸어요."

            } else {
                Log.d("비밀메모앱", "통과!")
                startActivity(intent)
                this.finish()
            }
        }

    }
}