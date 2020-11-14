package com.robin1.portfolio.data.source

import com.robin1.portfolio.data.api.RetrofitService

class RemoteDataSource(
    private val service: RetrofitService
) : DataSource {

    companion object {
        private var INSTANCE: RemoteDataSource? = null

        @JvmStatic
        fun getInstance(service: RetrofitService) =
            INSTANCE ?: synchronized(RemoteDataSource::class.java) {
                INSTANCE ?: RemoteDataSource(service)
                    .also { INSTANCE = it }
            }
    }
}