package com.android.eexpo.ui.home.hotdeals

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.android.eexpo.R
import com.android.eexpo.databinding.HotDealFragmentBinding
import com.android.eexpo.ui.adaptor.CategoryAdaptor
import com.android.eexpo.ui.adaptor.HotDealAdaptor
import com.android.eexpo.ui.base.BaseFragment

class HotDealFragment : BaseFragment<HotDealViewModel, HotDealFragmentBinding>() {

    val hotDealAdaptor : HotDealAdaptor by lazy { HotDealAdaptor() }

    override fun getFragmentView(): Int = R.layout.hot_deal_fragment

    override fun getViewModel(): Class<HotDealViewModel> = HotDealViewModel::class.java

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.getHotDeals()
        binding.hotdealRecyclerView.adapter= hotDealAdaptor
        viewModel.hotDealResponse.observe(viewLifecycleOwner, Observer {
            hotDealAdaptor.list = it
        })

    }

}