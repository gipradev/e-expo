package com.android.eexpo.data.model

import com.android.eexpo.R

data class NewArrivalModel(
    var id: Int? = null,
    var name: String? = null,
    var image: Int? = null,
    var price : String? = null
)

object newArrivalSupplier {
    val newArrivalItem = listOf(
        NewArrivalModel(id = 0 , name = "Nike React Vision " , R.drawable._8530_3_nike_shoes_transparent,price = "10,499"),
        NewArrivalModel(id = 0 , name = "Perfume" , R.drawable.__2_perfume_free_download_png_thumb,price = "10,499"),
        NewArrivalModel(id = 0 , name = "Perfume" , R.drawable.unnamed,price = "10,499"),
        NewArrivalModel(id = 0 , name = "Backpack" , R.drawable.backpack_png6321,price = "10,499"),

    )
}


