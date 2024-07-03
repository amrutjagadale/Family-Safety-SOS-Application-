package com.example.familysafety

import android.app.Application

class MyFamiliApplication :Application() {
    override fun onCreate() {
        super.onCreate()

        SharedPref.init(this)
    }
}