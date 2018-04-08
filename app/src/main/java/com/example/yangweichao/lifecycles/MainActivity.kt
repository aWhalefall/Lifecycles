package com.example.yangweichao.lifecycles

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var myLocationListener: MylocationListener? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myLocationListener = MylocationListener(
                this,
                object : DemoCallBack {
                    override fun start() {
                    }

                }
        )
    }

    override fun onStart() {
        super.onStart()
        myLocationListener?.start()
    }

    override fun onStop() {
        super.onStop()
        myLocationListener?.stop()
    }

}
