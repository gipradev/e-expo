package com.android.eexpo.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider


abstract class BaseActivity<VM : BaseViewModel, DB : ViewDataBinding> : AppCompatActivity() {

    protected lateinit var binding: DB
    protected lateinit var viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

     //   viewModel = ViewModelProvider(this).get(getViewModel())
        binding = DataBindingUtil.setContentView(this, getLayout())

    }

    fun showHeader(status: Boolean = false) {
        viewModel.displayHeader(status)
    }

    abstract fun getViewModel(): Class<VM>

    abstract fun getLayout(): Int


}