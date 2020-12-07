package com.android.eexpo.ui.adaptor

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.eexpo.data.model.OfferModel
import com.android.eexpo.databinding.OfferItemBinding


class OfferAdaptor() :
    RecyclerView.Adapter<OfferAdaptor.MyViewHolder>() {

    var list: List<OfferModel> = arrayListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }


    inner class MyViewHolder(var binding: OfferItemBinding) :
        RecyclerView.ViewHolder(binding.root) {


        fun setModel(offerModel: OfferModel) {
            binding.offerModel = offerModel

            offerModel.image?.let { binding.offerImage.setImageResource(it) }

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        return MyViewHolder(
            OfferItemBinding.inflate(
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