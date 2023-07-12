package com.example.alipedia.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.alipedia.databinding.ActivityMainBinding
import com.example.alipedia.databinding.FragmentExploreBinding
import com.example.alipedia.databinding.FragmentProfileBinding
import com.example.alipedia.databinding.FragmentTrendsBinding

class FragmentExplore : Fragment() {
    lateinit var binding: FragmentExploreBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExploreBinding.inflate(layoutInflater , container , false)
        return binding.root
    }

}