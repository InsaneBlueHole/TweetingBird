package com.example.tweetingbird

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var soundPlayer: MediaPlayer? = null

    fun playSound(view: View) {
        if (soundPlayer == null) {
            soundPlayer = MediaPlayer.create(this, R.raw.bird)
            soundPlayer!!.isLooping = true
            soundPlayer!!.start()
        } else soundPlayer!!.start()
    }

    fun pauseSound(view: View) {
        if (soundPlayer != null && soundPlayer!!.isPlaying) soundPlayer!!.pause()
    }
}
