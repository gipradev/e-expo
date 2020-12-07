package com.android.eexpo.ui.home.hotdeals

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.eexpo.data.model.CategoryModel
import com.android.eexpo.data.model.HotDealModel
import com.android.eexpo.data.model.hotDealSupplier

class HotDealViewModel : ViewModel() {

    val hotDealResponse: LiveData<List<HotDealModel>> = MutableLiveData()

    fun getHotDeals() {
        hotDealResponse as MutableLiveData
        hotDealResponse.value = hotDealSupplier.hotDealItem
    }

}