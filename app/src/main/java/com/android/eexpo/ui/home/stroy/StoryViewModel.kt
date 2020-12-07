package com.android.eexpo.ui.home.stroy

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.eexpo.data.model.StoryModel
import com.android.eexpo.data.model.storySupplier
import com.android.eexpo.ui.base.BaseViewModel

class StoryViewModel : BaseViewModel() {

    val storyResponse: LiveData<List<StoryModel>> = MutableLiveData()

    fun getStories() {
        storyResponse as MutableLiveData
        storyResponse.value = storySupplier.storyItem
    }
}