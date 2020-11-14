package com.robin1.portfolio

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.robin1.portfolio.data.api.RetrofitClient
import com.robin1.portfolio.data.source.RemoteDataSource
import com.robin1.portfolio.data.source.Repository
import com.robin1.portfolio.ui.home.HomeViewModel
import com.robin1.portfolio.ui.login.LoginViewModel
import com.robin1.portfolio.ui.splash.SplashViewModel

@Suppress("UNCHECKED_CAST")
class ViewModelFactory private constructor(
    private val repository: Repository,
) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>) =
        with(modelClass) {
            when {
                isAssignableFrom(SplashViewModel::class.java) ->
                    SplashViewModel(repository)
                isAssignableFrom(LoginViewModel::class.java) ->
                    LoginViewModel(repository)
                isAssignableFrom(HomeViewModel::class.java) ->
                    HomeViewModel(repository)
                else ->
                    throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
            }
        } as T

    companion object {
        @Volatile
        private var INSTANCE: ViewModelFactory? = null

        fun getInstance() =
            INSTANCE ?: synchronized(ViewModelFactory::class.java) {
                INSTANCE ?: ViewModelFactory(
                    Repository.getInstance(
                        RemoteDataSource.getInstance(RetrofitClient.client)
                    )
                ).also { INSTANCE = it }
            }
    }
}
