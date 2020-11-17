package com.robin1.portfolio.ui.splash

import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.robin1.portfolio.R
import com.robin1.portfolio.base.BaseActivity
import com.robin1.portfolio.databinding.ActivitySplashBinding
import com.robin1.portfolio.ext.action
import com.robin1.portfolio.ext.snack
import com.robin1.portfolio.ext.toast

class SplashActivity : BaseActivity<ActivitySplashBinding, SplashViewModel>(
    R.layout.activity_splash,
    SplashViewModel::class.java
) {
    override fun start() {
    }

    override fun onObserve() {
    }

}