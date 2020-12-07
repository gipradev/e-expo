package com.android.eexpo.ui.home.expopick

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.eexpo.data.model.CategoryModel
import com.android.eexpo.data.model.ExpoPickModel
import com.android.eexpo.data.model.categorySupplier
import com.android.eexpo.data.model.expoPickSupplier

class ExpoPickViewModel : ViewModel() {
    val expoResponse: LiveData<List<ExpoPickModel>> = MutableLiveData()

    fun getExpoPick() {
        expoResponse as MutableLiveData
        expoResponse.value = expoPickSupplier.expoPickItem
    }
}