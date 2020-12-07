package com.android.eexpo.ui.home.offer

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.lifecycle.Observer
import androidx.viewpager2.widget.ViewPager2
import com.android.eexpo.R
import com.android.eexpo.data.model.offerSupplier
import com.android.eexpo.databinding.OfferFragmentBinding
import com.android.eexpo.ui.adaptor.OfferAdaptor
import com.android.eexpo.ui.base.BaseFragment
import com.google.android.material.tabs.TabLayoutMediator


class OfferFragment : BaseFragment<OfferViewModel, OfferFragmentBinding>() {

    val offerAdapter: OfferAdaptor by lazy { OfferAdaptor() }
    var itemCount: Int = offerSupplier.offerItem.size

    override fun getFragmentView(): Int = R.layout.offer_fragment

    override fun getViewModel(): Class<OfferViewModel> = OfferViewModel::class.java

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        binding.offerViewPager.adapter = offerAdapter
        viewModel.getOfferList()
        viewModel.offerResponse.observe(viewLifecycleOwner, Observer {
            offerAdapter.list = it
        })

        binding.offerViewPager.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                Handler(Looper.getMainLooper()).removeCallbacks(runnable)
                Handler(Looper.getMainLooper()).postDelayed(runnable, 3000)
            }
        })

        TabLayoutMediator(binding.indicator, binding.offerViewPager) { tab, position ->


        }.attach()


    }

    val runnable: Runnable = object : Runnable {
        override fun run() {
            if (binding.offerViewPager.currentItem < itemCount - 1) {
                binding.offerViewPager.setCurrentItem(binding.offerViewPager.currentItem + 1)
            } else binding.offerViewPager.setCurrentItem(0)

        }
    }


}

