package com.robin1.portfolio.ui.widget

import com.robin1.portfolio.R
import com.robin1.portfolio.base.BaseActivity
import com.robin1.portfolio.databinding.ActivityWidgetBinding

class WidgetActivity : BaseActivity<ActivityWidgetBinding, WidgetViewModel>(
    R.layout.activity_widget,
    WidgetViewModel::class.java
){
    override fun start() {
    }

    override fun onObserve() {
    }

}