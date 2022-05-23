package com.Misael.netflixclone

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.Misael.netflixclone.databinding.ActivityVideoBinding

class Video : AppCompatActivity() {

    private lateinit var binding: ActivityVideoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val videoURL = Uri.parse("https://firebasestorage.googleapis.com/v0/b/netflix-clone-fb364.appspot.com/o/THE%20WITCHER%20_%20TRAILER%20FINAL%20_%20NETFLIX.mp4?alt=media&token=0f2e22a6-8975-414e-802b-2c8d4516c4a8")

        val video = binding.video
        video.setMediaController(MediaController(this))
        video.setVideoURI(videoURL)
        video.requestFocus()
        video.start()

    }
}