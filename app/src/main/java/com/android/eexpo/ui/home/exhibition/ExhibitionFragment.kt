package com.android.eexpo.ui.home.exhibition

import android.os.Bundle
import androidx.lifecycle.Observer
import com.android.eexpo.R
import com.android.eexpo.databinding.ExhibitionFragmentBinding

import com.android.eexpo.ui.base.BaseFragment

class ExhibitionFragment : BaseFragment<ExhibitionViewModel, ExhibitionFragmentBinding>() {

    override fun getFragmentView(): Int = R.layout.exhibition_fragment

    override fun getViewModel(): Class<ExhibitionViewModel> = ExhibitionViewModel::class.java

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.getExhibition()
        viewModel.exhibitionResponse.observe(viewLifecycleOwner, Observer {
            binding.exhibitionModel = it
        })
    }

}