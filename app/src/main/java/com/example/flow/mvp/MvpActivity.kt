package com.example.mvp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.flow.R

class MvpActivity : AppCompatActivity(),IView{
    private lateinit var presenter:MvpPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MvpPresenter(MvpModel(),this)

        findViewById<Button>(R.id.btn_login).setOnClickListener {
            presenter.login(findViewById<TextView>(R.id.tv_account).text.toString(),
                findViewById<TextView>(R.id.tv_pwd).text.toString())
        }
    }

    override fun loginSuccess() {
        Toast.makeText(this,"登陆成功", Toast.LENGTH_LONG).show()
    }

    override fun loginFailure(message: String) {
        Toast.makeText(this,message, Toast.LENGTH_LONG).show()
    }
}