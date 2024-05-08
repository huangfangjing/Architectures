package com.example.mvc

import com.example.flow.mvc.MvcActivity

class MvcController(private val viewModel: MvcViewModel) {
    fun login(activity: MvcActivity, userNmae: String, password: String) {
        viewModel.login(activity,userNmae,password)
    }
}
