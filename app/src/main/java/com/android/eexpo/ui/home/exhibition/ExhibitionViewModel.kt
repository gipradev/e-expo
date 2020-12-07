package com.android.eexpo.ui.home.exhibition

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.eexpo.R
import com.android.eexpo.data.model.CategoryModel
import com.android.eexpo.data.model.ExhibitionModel

class ExhibitionViewModel : ViewModel() {

    val exhibitionResponse: LiveData<ExhibitionModel> = MutableLiveData()
    var exhibitionModel: ExhibitionModel

    init {
        exhibitionModel = ExhibitionModel(
            id = 0,
            name = "exhibition",
            image = R.drawable.mask_group_21,
            time = "5 Days : 8 hours : 51 Min : 24 Sec"
        )
    }


    fun getExhibition() {

        exhibitionResponse as MutableLiveData
        exhibitionResponse.value = exhibitionModel
    }

}