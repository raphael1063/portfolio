package com.robin1.portfolio.ui.home

import com.robin1.portfolio.R
import com.robin1.portfolio.base.BaseActivity
import com.robin1.portfolio.databinding.ActivityHomeBinding

class HomeActivity : BaseActivity<ActivityHomeBinding, HomeViewModel>(
    R.layout.activity_home,
    HomeViewModel::class.java
) {

    private val adapter by lazy {
        HomeAdapter(viewModel)
    }

    override fun start() {
        binding.apply {
            rvHomeItem.adapter = adapter
        }
    }

    override fun onObserve() {
        viewModel.run {
            homeItemArray.observe(this@HomeActivity, { array ->
                adapter.setItem(array)
            })
        }
    }
}