package com.robin1.portfolio.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.robin1.portfolio.ext.obtainViewModel

abstract class BaseActivity<VB : ViewDataBinding, VM: BaseViewModel>(
    @LayoutRes
    private val layoutRes: Int,
    private val viewModelClass: Class<VM>
): AppCompatActivity() {

    protected lateinit var binding: VB

    protected val viewModel: VM
        get() = obtainViewModel(viewModelClass)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutRes)
        binding.lifecycleOwner = this
        start()
        setBinding()
        onObserve()
    }

    abstract fun start()
    abstract fun setBinding()
    abstract fun onObserve()
}