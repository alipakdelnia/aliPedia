package com.example.alipedia.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.alipedia.R
import com.example.alipedia.databinding.FragmentCarLoverBinding

class FragmentCarLover : Fragment() {
    lateinit var binding: FragmentCarLoverBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCarLoverBinding.inflate(layoutInflater , container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val glide = Glide.with(requireContext())
            .load(R.drawable.ferrari)
            .into(binding.imgCarlover)

    }

}