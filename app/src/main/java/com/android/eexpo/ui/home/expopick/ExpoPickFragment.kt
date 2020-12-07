package com.android.eexpo.ui.home.expopick

import android.os.Bundle
import androidx.lifecycle.Observer
import com.android.eexpo.R
import com.android.eexpo.databinding.ExpoPickFragmentBinding
import com.android.eexpo.ui.adaptor.ExpoPickAdaptor
import com.android.eexpo.ui.base.BaseFragment

class ExpoPickFragment : BaseFragment<ExpoPickViewModel, ExpoPickFragmentBinding>() {

    val expoPickAdaptor: ExpoPickAdaptor by lazy { ExpoPickAdaptor() }

    override fun getFragmentView(): Int = R.layout.expo_pick_fragment

    override fun getViewModel(): Class<ExpoPickViewModel> = ExpoPickViewModel::class.java

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.getExpoPick()
        binding.expoRecyclerView.adapter = expoPickAdaptor
        viewModel.expoResponse.observe(viewLifecycleOwner, Observer {
            expoPickAdaptor.list = it
        })

    }
}