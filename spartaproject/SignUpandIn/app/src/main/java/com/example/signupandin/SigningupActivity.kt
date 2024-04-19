package com.example.signupandin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SigningupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signingup)
        val name = findViewById<EditText>(R.id.et_naming)
        val id2 = findViewById<EditText>(R.id.et_id2)
        val password2 = findViewById<EditText>(R.id.et_password2)
        val btn_sign = findViewById<Button>(R.id.btn_signup2)
        btn_sign.setOnClickListener {
            if (name.text.toString().isNotEmpty() && id2.text.toString().isNotEmpty()
                && password2.text.toString().isNotEmpty()) {
                intent.putExtra("id_back", id2.text.toString())        			// 아이디 전달
                intent.putExtra("password_back", password2.text.toString())        // 비밀번호 전달
                setResult(RESULT_OK, intent)        			// RESULT_OK 전달하여 ActivityResult 수신 구문 실행

                finish()
                }
            else
                Toast.makeText(this@SigningupActivity, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()

        }//하나라도 입력되지 않은 정보가 있을경우 경고메시지를 띄운다.
    }
}