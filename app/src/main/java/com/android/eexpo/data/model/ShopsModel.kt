package com.android.eexpo.data.model

import com.android.eexpo.R

data class ShopsModel(
    var id: Int? = null,
    var name: String? = null,
    var image: Int? = null,
)

object shopSupplier {
    val shopItem = listOf(
        ShopsModel(id = 0 , name = "Allen Sally" , R.drawable.mask_group_19),
        ShopsModel(id = 0 , name = "KFC" , R.drawable.group_8037),
        ShopsModel(id = 0 , name = "Woodland" , R.drawable.group_8038),
        ShopsModel(id = 0 , name = "My G" , R.drawable.group_8035),
        ShopsModel(id = 0 , name = "McDonalds" , R.drawable.group_8039),
    )
}


