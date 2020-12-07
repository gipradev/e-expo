package com.android.eexpo.data.model

import com.android.eexpo.R

data class CategoryModel(
    var id: Int? = null,
    var name: String? = null,
    var image: Int? = null,
)

object categorySupplier {
    val categoryItem = listOf(
        CategoryModel(id = 0 , name = "Food" , R.drawable.mask_group_6),
        CategoryModel(id = 0 , name = "Accessories" , R.drawable.mask_group_8),
        CategoryModel(id = 0 , name = "Perfume" , R.drawable.mask_group_7),
        CategoryModel(id = 0 , name = "Books" , R.drawable.mask_group_9),
    )
}


