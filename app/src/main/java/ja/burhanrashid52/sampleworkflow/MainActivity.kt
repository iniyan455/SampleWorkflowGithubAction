package ja.burhanrashid52.sampleworkflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtConfig = findViewById<TextView>(R.id.txtConfig)

        val configText = """
            BASE URL :  ${BuildConfig.BASE_URL}
            MAP_KEY :  ${BuildConfig.API_KEY}
            RE-ATTEMPT :  ${BuildConfig.GATEWAY}
            THRESHOLD VALUE :  ${BuildConfig.APPTYPE}
        """.trimIndent()

        txtConfig.text = configText
    }
}