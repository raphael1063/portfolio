package com.robin1.portfolio.util

import com.robin1.portfolio.data.entities.HomeItemModel
import com.robin1.portfolio.data.entities.HomeItemType.SUBTITLE
import com.robin1.portfolio.data.entities.HomeItemType.TITLE

object AppUtil {

    fun getHomeItemList() : ArrayList<HomeItemModel> {
        return ArrayList<HomeItemModel>().apply {
            add(HomeItemModel(TITLE, "Widget"))
            add(HomeItemModel(SUBTITLE, "TextView"))
            add(HomeItemModel(SUBTITLE, "ImageView"))
            add(HomeItemModel(SUBTITLE, "ScrollView"))
            add(HomeItemModel(SUBTITLE, "Recyclerview"))
            add(HomeItemModel(SUBTITLE, "WebView"))
        }
    }
}