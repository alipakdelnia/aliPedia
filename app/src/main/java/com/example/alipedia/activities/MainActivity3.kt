package com.example.alipedia.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.RoundedCorner
import com.bumptech.glide.Glide
import com.example.alipedia.R
import com.example.alipedia.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        Glide
            .with(this)
            .load(R.drawable.ferrari)
            .into(binding.imgCartab)

    }
}