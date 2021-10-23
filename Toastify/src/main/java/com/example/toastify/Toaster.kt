package com.example.toastify

import android.content.Context
import android.widget.Toast

object Toaster {
    fun shortToast(context: Context){
        Toast.makeText(context, "Short Toast", Toast.LENGTH_SHORT).show()
    }

    fun longToast(context: Context){
        Toast.makeText(context, "Long Toast", Toast.LENGTH_LONG).show()
    }
}