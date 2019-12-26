package com.sarveshathawale.mobilehubapplication

import android.app.Application
import com.bugsnag.android.Bugsnag
import com.bugsnag.android.Configuration

class MobileHubAppProdImpl(private val application: Application) : MobileHubDelegate {

    override fun onCreate() {
        val configuration = Configuration(BuildConfig.BUGSNAG_API_KEY)
        configuration.maxBreadcrumbs = 50

        Bugsnag.init(application, configuration)
    }
}
