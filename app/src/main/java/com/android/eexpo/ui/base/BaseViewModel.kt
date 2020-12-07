package com.android.eexpo.ui.base



import androidx.databinding.ObservableBoolean
import androidx.lifecycle.ViewModel


abstract class BaseViewModel(
) : ViewModel() {

    var showHeader: ObservableBoolean = ObservableBoolean(false)

    /**
     * Method to display header
     */
    fun displayHeader(status: Boolean = true) {
        showHeader.set(status)
    }


    /**
     * Method to check internet connectivity
     */
//    fun checkInternetConnectivity(): Boolean {
//        if (NetworkUtils.isInternetAvailable(appContext)) return true
//       // showErrorMessageView(true)
//        return false
//    }
}