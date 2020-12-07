package com.android.eexpo.ui.home.category

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.android.eexpo.R
import com.android.eexpo.databinding.CategoryFragmentBinding
import com.android.eexpo.ui.adaptor.CategoryAdaptor
import com.android.eexpo.ui.adaptor.StoryAdaptor
import com.android.eexpo.ui.base.BaseFragment

class CategoryFragment : BaseFragment<CategoryViewModel, CategoryFragmentBinding>() {

    val categoryAdaptor : CategoryAdaptor by lazy { CategoryAdaptor() }

    override fun getFragmentView(): Int = R.layout.category_fragment

    override fun getViewModel(): Class<CategoryViewModel> = CategoryViewModel::class.java

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.getCategory()
        binding.categoryRecyclerView.adapter = categoryAdaptor
        viewModel.categoryResponse.observe(viewLifecycleOwner, Observer {
            categoryAdaptor.list = it
        })

    }
}