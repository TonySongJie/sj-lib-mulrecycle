package com.sj.lib.test

import android.app.Application
import com.xuan.mulrecycle.EFLogger

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        EFLogger.init("")
        EFLogger.isDebug(BuildConfig.DEBUG)
    }
}