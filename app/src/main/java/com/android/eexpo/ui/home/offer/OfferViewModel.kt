package com.android.eexpo.ui.home.offer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.eexpo.data.model.OfferModel
import com.android.eexpo.data.model.offerSupplier


class OfferViewModel : ViewModel() {

    val offerResponse: LiveData<List<OfferModel>> = MutableLiveData()


    fun getOfferList() {
        offerResponse as MutableLiveData
        offerResponse.value = offerSupplier.offerItem
    }

}