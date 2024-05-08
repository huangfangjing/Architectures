package com.example.mvp

interface IView {
    fun loginSuccess()
    fun loginFailure(message: String)
}