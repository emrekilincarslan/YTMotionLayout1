package com.example.ytmotionlayout

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val videoView = findViewById<View>(R.id.main_video) as VideoView
        val mc = MediaController(this)
        videoView.setMediaController(mc)

        val str = "https://www.rmp-streaming.com/media/big-buck-bunny-360p.mp4"
        val uri = Uri.parse(str)

        videoView.setVideoURI(uri)

        videoView.requestFocus()
        videoView.start()
    }
}