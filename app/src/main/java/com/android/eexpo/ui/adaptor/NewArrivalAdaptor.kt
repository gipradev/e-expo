package com.android.eexpo.ui.adaptor

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.eexpo.data.model.CategoryModel
import com.android.eexpo.data.model.HotDealModel
import com.android.eexpo.data.model.NewArrivalModel
import com.android.eexpo.data.model.StoryModel
import com.android.eexpo.databinding.CategoryItemBinding
import com.android.eexpo.databinding.HotDealItemBinding
import com.android.eexpo.databinding.NewArrivalItemBinding
import com.android.eexpo.databinding.StoryItemBinding


class NewArrivalAdaptor() :
    RecyclerView.Adapter<NewArrivalAdaptor.MyViewHolder>() {

    var list: List<NewArrivalModel> = arrayListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }




    inner class MyViewHolder(var binding: NewArrivalItemBinding) :
        RecyclerView.ViewHolder(binding.root) {


        fun setModel(newArrivalModel: NewArrivalModel) {
            binding.newArrivalModel = newArrivalModel
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        return MyViewHolder(
            NewArrivalItemBinding.inflate(
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