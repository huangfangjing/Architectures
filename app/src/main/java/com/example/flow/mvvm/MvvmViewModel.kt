package com.example.flow.mvvm

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel


class MvvmViewModel : ViewModel() {
    var account: ObservableField<String> = ObservableField("")
    var pwd: ObservableField<String> = ObservableField("")
    var result: ObservableField<String> = ObservableField("")

    private var mvvmModel: MvvmModel = MvvmModel()

    fun login() {
        val loginResult: Boolean = mvvmModel.login(account.get(), pwd.get())
        result.set(if (loginResult) "登录结果：成功" else "登录结果：失败")
    }
}
