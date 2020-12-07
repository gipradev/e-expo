package com.android.eexpo.ui.home.shops

import android.os.Bundle
import androidx.lifecycle.Observer
import com.android.eexpo.R
import com.android.eexpo.databinding.ShopsFragmentBinding
import com.android.eexpo.ui.adaptor.ShopAdaptor
import com.android.eexpo.ui.base.BaseFragment

class ShopsFragment : BaseFragment<ShopsViewModel, ShopsFragmentBinding>() {

    val shopAdaptor : ShopAdaptor by lazy { ShopAdaptor() }

    override fun getViewModel(): Class<ShopsViewModel> = ShopsViewModel::class.java

    override fun getFragmentView(): Int = R.layout.shops_fragment

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.getShops()
        binding.shopRecyclerView.adapter = shopAdaptor
        viewModel.shopResponse.observe(viewLifecycleOwner, Observer {
            shopAdaptor.list = it
        })
    }
}