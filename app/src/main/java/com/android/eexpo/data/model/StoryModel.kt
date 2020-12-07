package com.android.eexpo.data.model

import com.android.eexpo.R

data class StoryModel(
    var id: Int? = null,
    var name: String? = null,
    var image: Int? = null,
)

object storySupplier {
    val storyItem = listOf(
        StoryModel(id = 0 , name = "e-store" , R.drawable.group_8033),
        StoryModel(id = 0 , name = "My G" , R.drawable.group_8035),
        StoryModel(id = 0 , name = "KFC" , R.drawable.group_8037),
        StoryModel(id = 0 , name = "Woodland" , R.drawable.group_8038),
        StoryModel(id = 0 , name = "McDonalds" , R.drawable.group_8039),
    )
}


