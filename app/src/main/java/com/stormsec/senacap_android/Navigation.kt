package com.stormsec.senacap_android

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v4.app.ActivityCompat

class Navigation {
    companion object {
        private fun startActivity(context: Context, intent: Intent) {
            ActivityCompat.startActivity(context, intent, null)
        }

        fun goToHome(activity: Activity) {
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(activity, intent)
        }

        fun goToLogin(activity: Activity){
            val intent = Intent(activity, LoginActivity::class.java)
            startActivity(activity,intent)
        }

        fun goToResults(activity: Activity){
            val intent = Intent(activity, ResultsActivity::class.java)
            startActivity(activity,intent)
        }

        fun goToMyTitles(activity: Activity){
            val intent = Intent(activity, MyTitlesActivity::class.java)
        }

    }
}