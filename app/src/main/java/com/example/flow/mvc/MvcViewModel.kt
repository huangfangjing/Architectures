package com.example.mvc

import com.example.flow.mvc.MvcActivity

class MvcViewModel {

    fun login(activity: MvcActivity, userName: String, password: String){
        if (userName.isEmpty() || password.isEmpty()) {
           activity.loginFail("请输入内容")
            return
        }
        if (userName == "123" && password == "123") {
            activity.loginSuccess("登陆成功")
            return
        }
        activity.loginFail("密码错误")
    }
}