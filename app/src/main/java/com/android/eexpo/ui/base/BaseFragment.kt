package com.android.eexpo.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


abstract class BaseFragment<VM : ViewModel, DB : ViewDataBinding> : Fragment() {

    protected lateinit var binding: DB
    protected lateinit var viewModel: VM


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, getFragmentView(), container, false
        )

        viewModel = ViewModelProvider(this).get(getViewModel())

        return binding.root
    }

    abstract fun getFragmentView(): Int
    abstract fun getViewModel(): Class<VM>


}