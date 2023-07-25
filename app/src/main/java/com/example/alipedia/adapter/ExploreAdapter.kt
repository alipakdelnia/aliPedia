package com.example.alipedia.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.alipedia.data.ItemPost
import com.example.alipedia.databinding.ItemExploreBinding

class ExploreAdapter(private val data: ArrayList<ItemPost>) :
    RecyclerView.Adapter<ExploreAdapter.ExploreViewHolder>() {
    lateinit var binding: ItemExploreBinding

    inner class ExploreViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(itemPost: ItemPost) {

            val glide = Glide
                .with(itemView.context)
                .load(itemPost.imgUrl)
                .into(binding.imgExplore)

            binding.tvExoloreTitle.text = itemPost.txtTitle
            binding.tvExploreSubtitle.text = itemPost.txtSubtitle
            binding.tvExploreFullText.text = itemPost.txtDetail

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExploreViewHolder {
        binding = ItemExploreBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ExploreViewHolder(binding.root)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ExploreViewHolder, position: Int) {
        holder.bindView(data[position])

    }

}