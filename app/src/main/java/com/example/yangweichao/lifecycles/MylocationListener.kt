package com.example.yangweichao.lifecycles

import android.content.Context
import javax.security.auth.callback.Callback

/**
 * Created by yangweichao on 2018/4/8.
 */
open  class  MylocationListener constructor (mainActivity: MainActivity, nothing: DemoCallBack) {



    fun start() {
        // connect to system location service
    }

    fun stop() {
        // disconnect from system location service
    }
}