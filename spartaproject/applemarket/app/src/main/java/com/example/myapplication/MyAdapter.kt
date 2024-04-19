package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemRecyclerviewBinding

class MyAdapter(val mItems:MutableList<Items>) : RecyclerView.Adapter<MyAdapter.Holder>(),function{

    interface ItemClick{
        fun onClick(view:View,position:Int)
    }
    var itemClick:ItemClick? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemRecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.itemView.setOnClickListener {  //클릭이벤트추가부분
            itemClick?.onClick(it, position)
        }
        holder.imageView.clipToOutline = true
        holder.imageView.setImageResource(mItems[position].image)
        holder.nameView.text = mItems[position].name

        //holder.introView.text = mItems[position].Intro
        holder.addressView.text = mItems[position].address
        //holder.sellerView.text = mItems[position].seller
        holder.chattingView.text = mItems[position].chatting.toString()
        holder.likeView.text = mItems[position].like.toString()
        val Price = mItems[position].price

        holder.priceView.text = makePrice(Price)

    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    override fun getItemCount(): Int {
        return mItems.size
    }
    inner class Holder( binding:ItemRecyclerviewBinding ) : RecyclerView.ViewHolder(binding.root) {
        val imageView = binding.ImageView
        val nameView = binding.NameView
       // val introView = binding.IntroView
        val addressView = binding.AddressView
        //val sellerView = binding.SellerView
        val chattingView = binding.ChattingView
        val likeView = binding.LikeView
        val priceView = binding.PriceView

    }

}