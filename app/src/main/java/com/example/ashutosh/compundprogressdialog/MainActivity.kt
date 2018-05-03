package com.example.ashutosh.compundprogressdialog

import android.app.Dialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dialog = Dialog(this, R.style.TransparentProgressDialog)
        dialog.setCancelable(false)
        dialog.setCanceledOnTouchOutside(false)
        dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.custom_progress_layout)
        dialog.show()
    }
}
