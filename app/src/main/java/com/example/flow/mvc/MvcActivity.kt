package com.example.flow.mvc

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.flow.R
import com.example.mvc.MvcController
import com.example.mvc.MvcViewModel

class MvcActivity : AppCompatActivity() {
    private lateinit var controller: MvcController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        controller = MvcController(MvcViewModel())
        findViewById<Button>(R.id.btn_login).setOnClickListener {
            controller.login(this,findViewById<TextView>(R.id.tv_account).text.toString(),
                findViewById<TextView>(R.id.tv_pwd).text.toString())
        }
    }

    fun loginFail(s: String) {
        Toast.makeText(this,s,Toast.LENGTH_LONG).show()
    }

    fun loginSuccess(s: String) {
        Toast.makeText(this,s,Toast.LENGTH_LONG).show()
    }
}