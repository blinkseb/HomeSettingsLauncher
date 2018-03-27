package eu.madalynn.homesettingslauncher

import android.app.Activity
import android.content.Intent
import android.os.Bundle

/**
 * Loads [MainFragment].
 */
class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent("com.google.android.leanbacklauncher.SETTINGS")
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)

        finish()
    }
}
