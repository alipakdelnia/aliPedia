package com.example.alipedia.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.alipedia.R
import com.example.alipedia.databinding.ActivityMain3Binding
import com.example.alipedia.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    lateinit var binding: ActivityMain4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.chipGroupMain.setOnCheckedChangeListener { group, checkedId ->  
            
            when (checkedId){
                
                R.id.chip_android -> {
                    Toast.makeText(this, "android checked", Toast.LENGTH_SHORT).show()
                }
                
            }
            
            
        }

    }
}