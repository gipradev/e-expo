package com.android.eexpo.data.model

import com.android.eexpo.R

data class OfferModel(
    var id: Int? = null,
    var name: String? = null,
    var image: Int? = null,
)

object offerSupplier {
    val offerItem = listOf(
        OfferModel(id = 0 , name = "e-store" , R.drawable.mask_group_10),
        OfferModel(id = 0 , name = "My G" , R.drawable.mask_group_11),
    )
}


