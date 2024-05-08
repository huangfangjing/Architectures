package com.example.flow.mvvm

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.flow.BR
import com.example.flow.R
import com.example.flow.databinding.ActivityMainMvvmBinding

class MvvmActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainMvvmBinding
    private lateinit var viewModel: MvvmViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main_mvvm)
        viewModel = ViewModelProvider(this)[MvvmViewModel::class.java]
        binding.lifecycleOwner = this
        binding.setVariable(BR.viewModel,viewModel)

        findViewById<Button>(R.id.btn_login).setOnClickListener {
            viewModel.login()
        }
    }
}