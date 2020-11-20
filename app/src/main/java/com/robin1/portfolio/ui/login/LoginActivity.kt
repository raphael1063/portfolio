package com.robin1.portfolio.ui.login

import android.content.Intent
import com.robin1.portfolio.R
import com.robin1.portfolio.base.BaseActivity
import com.robin1.portfolio.databinding.ActivityLoginBinding
import com.robin1.portfolio.ui.home.HomeActivity

class LoginActivity : BaseActivity<ActivityLoginBinding, LoginViewModel>(
    R.layout.activity_login,
    LoginViewModel::class.java
) {
    override fun start() {
        binding.btnLoginTemp.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }

    override fun onObserve() {
    }

}