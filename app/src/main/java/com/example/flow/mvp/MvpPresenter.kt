package com.example.mvp

class MvpPresenter(private var model: MvpModel, var iView: IView) {

    fun login(userNmae: String, password: String) {
        val result = model.login(userNmae, password)
        if (result) {
            iView.loginSuccess()
        } else {
            iView.loginFailure("密码错误")
        }
    }
}