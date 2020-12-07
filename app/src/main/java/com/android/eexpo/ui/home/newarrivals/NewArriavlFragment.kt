package com.android.eexpo.ui.home.newarrivals

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.android.eexpo.R
import com.android.eexpo.databinding.NewArriavlFragmentBinding
import com.android.eexpo.ui.adaptor.HotDealAdaptor
import com.android.eexpo.ui.adaptor.NewArrivalAdaptor
import com.android.eexpo.ui.base.BaseFragment

class NewArriavlFragment : BaseFragment<NewArriavlViewModel, NewArriavlFragmentBinding>() {

    val newArrivalAdaptor : NewArrivalAdaptor by lazy { NewArrivalAdaptor() }

    override fun getFragmentView(): Int = R.layout.new_arriavl_fragment

    override fun getViewModel(): Class<NewArriavlViewModel> = NewArriavlViewModel::class.java

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.getNewArrivals()
        binding.newArrivalRecyclerView.adapter = newArrivalAdaptor
        viewModel.newArrivalResponse.observe(viewLifecycleOwner, Observer {
            newArrivalAdaptor.list = it
        })
    }

}