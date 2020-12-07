package com.android.eexpo.ui.home.stroy

import android.os.Bundle
import androidx.lifecycle.Observer
import com.android.eexpo.R
import com.android.eexpo.databinding.FragmentStoryBinding
import com.android.eexpo.ui.adaptor.StoryAdaptor
import com.android.eexpo.ui.base.BaseFragment

class StoryFragment : BaseFragment<StoryViewModel, FragmentStoryBinding>() {

    val storyAdaptor : StoryAdaptor by lazy { StoryAdaptor() }

    override fun getFragmentView(): Int = R.layout.fragment_story

    override fun getViewModel(): Class<StoryViewModel> = StoryViewModel::class.java

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.getStories()
        binding.storyRecycler.adapter = storyAdaptor
        viewModel.storyResponse.observe(viewLifecycleOwner, Observer {
            storyAdaptor.list = it
        })


    }
}