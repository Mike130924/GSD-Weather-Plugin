package uk.co.gsdweather.plugin

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView

/**
 * Initial settings entry point.
 *
 * D-pad text editing behaviour will be implemented explicitly: focusing a field
 * must not launch the soft keyboard; keyboard entry is activated by a deliberate
 * user action.
 */
class SettingsActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val message = TextView(this).apply {
            text = "GSD Weather Plugin\n\nStarter project created. Settings UI is the next implementation step."
            textSize = 20f
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
        }
        setContentView(message)
    }
}
