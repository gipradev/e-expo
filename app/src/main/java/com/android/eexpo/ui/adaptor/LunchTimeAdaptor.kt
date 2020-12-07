package com.android.eexpo.ui.adaptor

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.eexpo.data.model.*
import com.android.eexpo.databinding.*


class LunchTimeAdaptor() :
    RecyclerView.Adapter<LunchTimeAdaptor.MyViewHolder>() {

    var list: List<LunchTimeModel> = arrayListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }


    inner class MyViewHolder(var binding: LunchTimeItemBinding) :
        RecyclerView.ViewHolder(binding.root) {


        fun setModel(lunchTimeModel: LunchTimeModel) {
            binding.lunchModel = lunchTimeModel
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        return MyViewHolder(
            LunchTimeItemBinding.inflate(
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