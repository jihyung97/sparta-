package com.example.signupandin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import kotlin.random.Random

class FirstActivity : AppCompatActivity() {
    val ImageList = arrayOf(R.drawable.idea,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5)//5가지 이미지들 리스트
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var resultLauncher: ActivityResultLauncher<Intent>//callback하기위한 객체
        val Iv = findViewById<ImageView>(R.id.imageView)
        val Id = findViewById<EditText>(R.id.et_id)
        val password = findViewById<EditText>(R.id.et_password)
        val btn_signin = findViewById<Button>(R.id.btn_login)
        val btn_signup = findViewById<Button>(R.id.btn_signup)
        val random = Random
        val num = random.nextInt(5) // 0~4까지의 정수중 랜덤하게 생성한 값을 num으로 지정
        Iv.setImageResource(ImageList[num])//num을 ImageList의 인덱스로 사용해 랜덤하게 image를 불러올 수 있게된다.
        btn_signin.setOnClickListener {
            if (Id.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()) {
                val intent = Intent(this,HomeActivity::class.java)
                intent.putExtra("myId",Id.text.toString())
                intent.putExtra("myPassword",password.text.toString())
                startActivity(intent)
            }//isnotEmpty를 통해 로그인 할때 아이디 암호 모두 비어있지 않은 경우에만 homeactivity로 넘어가도록 하였다.
            else
                Toast.makeText(this@FirstActivity, "Id또는 비밀번호를 입력해주세요.", Toast.LENGTH_SHORT).show()

            }//토스트를 통해 하나라도 비어있는 경우 메시지가 발생하도록 하였다.
        btn_signup.setOnClickListener {
            val intent = Intent(this,SigningupActivity::class.java)
            resultLauncher.launch(intent) // 회원가입을 누를 때 회원가입 activity에서 받아온 정보들을 그대로 first activity에 받아오기 위해 사용

        }
        resultLauncher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
                if (result.resultCode == RESULT_OK) {
                    val idb = result.data?.getStringExtra("id_back") 	// 아이디 수신
                    val passwordb = result.data?.getStringExtra("password_back") 	// 비밀번호 수신

                    Id.setText(idb)					// 아이디에 입력
                    password.setText(passwordb)		// 비밀번호에 입력
                }
            }
        }

    }