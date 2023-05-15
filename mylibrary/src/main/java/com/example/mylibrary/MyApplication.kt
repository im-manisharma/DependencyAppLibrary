package com.example.mylibrary

import android.app.Application
import android.util.Log

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Log.e("MyApplication", "DependencyApp")
    }
}