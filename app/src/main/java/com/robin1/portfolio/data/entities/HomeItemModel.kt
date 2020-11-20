package com.robin1.portfolio.data.entities

data class HomeItemModel(
    /**
     * type: Title/SubTitle
     */
    var type: HomeItemType,
    /**
     * Title
     */
    var title : String,
    /**
     * Subtitle
     */
    var subtitle: String?
)