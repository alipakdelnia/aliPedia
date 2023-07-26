package com.example.alipedia.adapter

import com.example.alipedia.data.ItemPost

interface ItemEvent {

    fun onItemClicked (itemPost: ItemPost)

}