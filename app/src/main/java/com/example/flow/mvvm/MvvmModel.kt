package com.example.flow.mvvm

class MvvmModel {
    fun login(userNmae: String?, password: String?): Boolean {
        if (userNmae == null || password == null) {
            return false
        }
        if (userNmae == "123" && password == "123") {
            return true
        }
        return false
    }
}