package com.android.eexpo.ui.home.shops

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.eexpo.data.model.CategoryModel
import com.android.eexpo.data.model.ShopsModel
import com.android.eexpo.data.model.categorySupplier
import com.android.eexpo.data.model.shopSupplier

class ShopsViewModel : ViewModel() {

    val shopResponse: LiveData<List<ShopsModel>> = MutableLiveData()
    fun getShops() {
        shopResponse as MutableLiveData
        shopResponse.value = shopSupplier.shopItem
    }
}