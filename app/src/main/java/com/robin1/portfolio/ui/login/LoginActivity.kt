package com.robin1.portfolio.ui.login

import com.robin1.portfolio.R
import com.robin1.portfolio.base.BaseActivity
import com.robin1.portfolio.databinding.ActivityLoginBinding

class LoginActivity : BaseActivity<ActivityLoginBinding, LoginViewModel>(
    R.layout.activity_login,
    LoginViewModel::class.java
) {
    override fun start() {
    }

    fun setBinding() {
    }

    override fun onObserve() {
    }

}