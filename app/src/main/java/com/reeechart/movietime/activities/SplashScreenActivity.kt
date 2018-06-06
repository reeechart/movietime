package com.reeechart.movietime.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import com.reeechart.movietime.R

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class SplashScreenActivity : AppCompatActivity() {
    companion object {
        private val SPLASH_SCREEN_DURATION: Int = 3000
    }
    private val activityChangeHandler = Handler()

    private val activityChangerRunnable = Runnable {
        val mainIntent: Intent = Intent(this, MainActivity::class.java)
        this.startActivity(mainIntent)
        this.finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)

        // Trigger the initial hide() shortly after the activity has been
        // created, to briefly hint to the user that UI controls
        // are available.
        delayedMainActivity(SPLASH_SCREEN_DURATION)
    }

    /**
     * Schedules a call to hide() in [delayMillis], canceling any
     * previously scheduled calls.
     */
    private fun delayedMainActivity(delayMillis: Int) {
        activityChangeHandler.removeCallbacks(activityChangerRunnable)
        activityChangeHandler.postDelayed(activityChangerRunnable, delayMillis.toLong())
    }
}
