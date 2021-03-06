package com.android.eexpo.ui.adaptor

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.eexpo.data.model.ShopsModel
import com.android.eexpo.data.model.StoryModel
import com.android.eexpo.databinding.ShopItemBinding
import com.android.eexpo.databinding.ShopsFragmentBinding
import com.android.eexpo.databinding.StoryItemBinding


class ShopAdaptor() :
    RecyclerView.Adapter<ShopAdaptor.MyViewHolder>() {

    var list: List<ShopsModel> = arrayListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }


    inner class MyViewHolder(var binding: ShopItemBinding) :
        RecyclerView.ViewHolder(binding.root) {


        fun setModel(shopsModel: ShopsModel) {
            binding.shopModel = shopsModel
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        return MyViewHolder(
            ShopItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.setModel(list[position])


    }

    override fun getItemCount(): Int = list.size


    interface ItemClick {
        fun onItemSelected(id: String)
    }
}