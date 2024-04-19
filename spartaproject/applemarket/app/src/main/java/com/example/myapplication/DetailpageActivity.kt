package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityDetailpageBinding


class DetailpageActivity : AppCompatActivity(),function {
    private lateinit var binding: ActivityDetailpageBinding
//    companion object {
//        private const val info = "detailInformation"
//        fun newIntent(context:Context,items : Items): Intent =
//            Intent(context, DetailpageActivity::class.java).apply {
//                putExtra(info, items)
//            }
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailpageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    var intent:Intent = getIntent()
    var ItemData:Items? = intent.getParcelableExtra<Items>("data")
    binding.imageDetail.setImageResource(ItemData!!.image)
    binding.addressDetail.text = ItemData.address
    binding.nameDetail.text = ItemData.name
    binding.introDetail.text = ItemData.Intro
    binding.priceDetail.text = makePrice(ItemData.price)
    binding.sellerDetail.text = ItemData.seller
    binding.btnBack.setOnClickListener {
        finish() }






    }
}
