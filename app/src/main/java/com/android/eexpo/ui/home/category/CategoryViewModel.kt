package com.android.eexpo.ui.home.category

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.eexpo.data.model.CategoryModel
import com.android.eexpo.data.model.StoryModel
import com.android.eexpo.data.model.categorySupplier

class CategoryViewModel : ViewModel() {

    val categoryResponse: LiveData<List<CategoryModel>> = MutableLiveData()

    fun getCategory() {
        categoryResponse as MutableLiveData
        categoryResponse.value = categorySupplier.categoryItem
    }

}