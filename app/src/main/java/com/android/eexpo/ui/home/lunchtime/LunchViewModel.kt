package com.android.eexpo.ui.home.lunchtime

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.eexpo.data.model.ExpoPickModel
import com.android.eexpo.data.model.LunchTimeModel
import com.android.eexpo.data.model.expoPickSupplier
import com.android.eexpo.data.model.lunchTimeSupplier

class LunchViewModel : ViewModel() {

    val lunchResponse: LiveData<List<LunchTimeModel>> = MutableLiveData()

    fun getLunchTimeData() {
        lunchResponse as MutableLiveData
        lunchResponse.value = lunchTimeSupplier.lunchTimeItem
    }
}