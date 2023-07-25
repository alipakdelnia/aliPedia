package com.example.alipedia.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.alipedia.data.ItemPost
import com.example.alipedia.databinding.ItemTrendBinding

class TrendAdapter(private val data: ArrayList<ItemPost>) :
    RecyclerView.Adapter<TrendAdapter.ExploreViewHolder>() {
    lateinit var binding: ItemTrendBinding

    inner class ExploreViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(itemPost: ItemPost) {

            binding.tvTrendTitle.text = itemPost.txtTitle
            binding.tvTrendSubtitle.text = itemPost.txtSubtitle
            binding.tvTrendInsight.text = itemPost.insight
            binding.tvTrendNumber.text = (adapterPosition + 1).toString()

            Glide.with(binding.root)
                .load(itemPost.imgUrl)
                .into(binding.imgTrend)


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExploreViewHolder {
        binding = ItemTrendBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ExploreViewHolder(binding.root)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ExploreViewHolder, position: Int) {
        holder.bindView(data[position])

    }

}