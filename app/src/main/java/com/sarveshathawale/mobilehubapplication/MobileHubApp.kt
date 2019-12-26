package com.sarveshathawale.mobilehubapplication

import android.app.Application

class MobileHubApp : Application() {

    private val mobileHubDelegate by lazy { MobileHubAppProdImpl(this) }

    override fun onCreate() {
        super.onCreate()

        mobileHubDelegate.onCreate()
    }
}
