package com.android.eexpo.data.model

import com.android.eexpo.R

data class HotDealModel(
    var id: Int? = null,
    var name: String? = null,
    var image: Int? = null,
)

object hotDealSupplier {
    val hotDealItem = listOf(
        HotDealModel(id = 0 , name = "e-store" , R.drawable.image_79),
        HotDealModel(id = 0 , name = "My G" , R.drawable.image_81),
    )
}


