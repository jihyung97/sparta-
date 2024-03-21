package com.example.signupandin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val et_get = intent.getStringExtra("myId")//"myId"라는 이름으로 firstactivity에서 extra로 넘긴 id정보를 가져온다.
        val id3 = findViewById<EditText>(R.id.et_id3)
        id3.setText(et_get)//EditText항목에 가져온 정보를 세팅한다.
        val btn_finale = findViewById<Button>(R.id.btn_ending)
        btn_finale.setOnClickListener {
            finish()
        }

    }
}