package com.robin1.portfolio.ui.library

import com.robin1.portfolio.R
import com.robin1.portfolio.base.BaseActivity
import com.robin1.portfolio.databinding.ActivityLibraryBinding

class LibraryActivity : BaseActivity<ActivityLibraryBinding, LibraryViewModel>(
    R.layout.activity_library,
    LibraryViewModel::class.java
) {
    override fun start() {
    }

    override fun onObserve() {
    }
}