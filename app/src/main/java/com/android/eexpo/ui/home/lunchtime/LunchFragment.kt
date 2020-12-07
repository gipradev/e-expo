package com.android.eexpo.ui.home.lunchtime

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.android.eexpo.R
import com.android.eexpo.databinding.LunchFragmentBinding
import com.android.eexpo.ui.adaptor.ExpoPickAdaptor
import com.android.eexpo.ui.adaptor.LunchTimeAdaptor
import com.android.eexpo.ui.base.BaseFragment

class LunchFragment : BaseFragment<LunchViewModel,LunchFragmentBinding>(){

    val lunchTimeAdaptor: LunchTimeAdaptor by lazy { LunchTimeAdaptor() }


    override fun getFragmentView(): Int = R.layout.lunch_fragment

    override fun getViewModel(): Class<LunchViewModel> = LunchViewModel::class.java

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.getLunchTimeData()
        binding.lunchTimeRecyclerView.adapter = lunchTimeAdaptor
        viewModel.lunchResponse.observe(viewLifecycleOwner, Observer {
            lunchTimeAdaptor.list = it
        })
    }
}
