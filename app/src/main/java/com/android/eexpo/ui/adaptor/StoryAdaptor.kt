package com.android.eexpo.ui.adaptor

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.eexpo.data.model.StoryModel
import com.android.eexpo.databinding.StoryItemBinding


class StoryAdaptor() :
    RecyclerView.Adapter<StoryAdaptor.MyViewHolder>() {

    var list: List<StoryModel> = arrayListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }


    inner class MyViewHolder(var binding: StoryItemBinding) :
        RecyclerView.ViewHolder(binding.root) {


        fun setModel(cropModel: StoryModel) {
            binding.storyModel = cropModel
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        return MyViewHolder(
            StoryItemBinding.inflate(
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