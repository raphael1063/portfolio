package com.robin1.portfolio.ui.home

import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.robin1.portfolio.R
import com.robin1.portfolio.data.entities.HomeItemModel
import com.robin1.portfolio.data.entities.HomeItemType
import com.robin1.portfolio.data.entities.HomeItemType.TITLE

@BindingAdapter("homeItemModel")
fun setTitleBackground(layout: ConstraintLayout, model: HomeItemModel){
    when(model.title) {
        "Widget" -> {
            if(model.type == TITLE) {
                layout.setBackgroundColor(ContextCompat.getColor(layout.context, R.color.colorWidgetTitle))
            } else {
                layout.setBackgroundColor(ContextCompat.getColor(layout.context, R.color.colorWidgetSubtitle))
            }
        }
        "Library" -> {
            if(model.type == TITLE) {
                layout.setBackgroundColor(ContextCompat.getColor(layout.context, R.color.colorLibraryTitle))
            } else {
                layout.setBackgroundColor(ContextCompat.getColor(layout.context, R.color.colorLibrarySubtitle))
            }
        }
    }
}