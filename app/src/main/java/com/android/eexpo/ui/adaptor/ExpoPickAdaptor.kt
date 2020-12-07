package com.android.eexpo.ui.adaptor

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.eexpo.data.model.CategoryModel
import com.android.eexpo.data.model.ExpoPickModel
import com.android.eexpo.data.model.HotDealModel
import com.android.eexpo.data.model.StoryModel
import com.android.eexpo.databinding.CategoryItemBinding
import com.android.eexpo.databinding.ExpoPickItemBinding
import com.android.eexpo.databinding.HotDealItemBinding
import com.android.eexpo.databinding.StoryItemBinding


class ExpoPickAdaptor() :
    RecyclerView.Adapter<ExpoPickAdaptor.MyViewHolder>() {

    var list: List<ExpoPickModel> = arrayListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }


    inner class MyViewHolder(var binding: ExpoPickItemBinding) :
        RecyclerView.ViewHolder(binding.root) {


        fun setModel(expoPickModel: ExpoPickModel) {
            binding.expoModel = expoPickModel
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        return MyViewHolder(
            ExpoPickItemBinding.inflate(
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