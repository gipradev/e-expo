package com.android.eexpo.data.model

import com.android.eexpo.R

data class LunchTimeModel(
    var id: Int? = null,
    var name: String? = null,
    var image: Int? = null,
    var category: String? = null,
    var expectedTime: Int? = null,
    var specialOffer: Boolean?
)

object lunchTimeSupplier {
    val lunchTimeItem = listOf(
        LunchTimeModel(
            id = 0,
            name = "Pizza",
            R.drawable.mask_group_11,
            expectedTime = 25,
            specialOffer = true,
            category = "Pizza, American"
        ),
        LunchTimeModel(
            id = 0,
            name = "Pizza",
            R.drawable.mask_group_6,
            expectedTime = 15,
            specialOffer = true,
            category = "Pizza, American"
        ),
    )
}


