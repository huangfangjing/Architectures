package com.example.mvp

class MvpModel : IModel {
    override fun login(userNmae: String, password: String): Boolean {
        if (userNmae.isEmpty() || password.isEmpty()) {
            return false
        }
        if (userNmae == "123" && password == "123") {
            return true
        }
        return false
    }
}