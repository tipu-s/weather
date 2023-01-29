package com.example.weather

import android.app.Application
import android.content.Context
/*
* This class will give application context to other classes, who require reference of context.
* Add the WeatherApplication class in the manifest, to ensure when the application run this class will be initiated
* All other class get the context through this class companion object
* */
class WeatherApplication : Application() {
    companion object {
        const val TOKEN = "Token for API call"
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}