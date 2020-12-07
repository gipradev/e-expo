package com.android.eexpo.ui.home.newarrivals

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.eexpo.data.model.NewArrivalModel
import com.android.eexpo.data.model.newArrivalSupplier

class NewArriavlViewModel : ViewModel() {
    val newArrivalResponse: LiveData<List<NewArrivalModel>> = MutableLiveData()

    fun getNewArrivals() {
        newArrivalResponse as MutableLiveData
        newArrivalResponse.value = newArrivalSupplier.newArrivalItem
    }
}