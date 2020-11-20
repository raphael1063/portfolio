package com.robin1.portfolio.util

import com.robin1.portfolio.data.entities.HomeItemModel
import com.robin1.portfolio.data.entities.HomeItemType.SUBTITLE
import com.robin1.portfolio.data.entities.HomeItemType.TITLE

object AppUtil {

    fun getHomeItemList() : ArrayList<HomeItemModel> {
        return ArrayList<HomeItemModel>().apply {
            add(HomeItemModel(TITLE, "Widget", null))
            add(HomeItemModel(SUBTITLE, "Widget", "TextView"))
            add(HomeItemModel(SUBTITLE, "Widget", "ImageView"))
            add(HomeItemModel(SUBTITLE, "Widget", "ScrollView"))
            add(HomeItemModel(SUBTITLE, "Widget", "RecyclerView"))
            add(HomeItemModel(SUBTITLE, "Widget", "ViewPager"))
            add(HomeItemModel(SUBTITLE, "Widget", "WebView"))
            add(HomeItemModel(TITLE, "Library", null))
            add(HomeItemModel(SUBTITLE, "Library", "Glide"))
        }
    }
}