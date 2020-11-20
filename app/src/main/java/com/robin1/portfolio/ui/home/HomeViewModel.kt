package com.robin1.portfolio.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.robin1.portfolio.base.BaseViewModel
import com.robin1.portfolio.data.entities.HomeItemModel
import com.robin1.portfolio.data.source.Repository
import com.robin1.portfolio.util.AppUtil

class HomeViewModel(private val repository: Repository) : BaseViewModel() {

    private val _homeItemArray = MutableLiveData(AppUtil.getHomeItemList())
    val homeItemArray: LiveData<ArrayList<HomeItemModel>> = _homeItemArray


}