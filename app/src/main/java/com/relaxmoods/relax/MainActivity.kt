package com.relaxmoods.relax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

import android.media.AudioManager
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // create web view
        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.loadUrl("https://www.relaxmoods.com")
        myWebView.settings.javaScriptEnabled = true
        myWebView.settings.setAppCacheEnabled(true);

        val audioManager: AudioManager = getSystemService(AUDIO_SERVICE) as AudioManager
        audioManager.requestAudioFocus(this )
    }
}

private fun AudioManager.requestAudioFocus(context:MainActivity) {
    Toast.makeText(context, "Welcome to Relax Moods", Toast.LENGTH_SHORT).show()
}
