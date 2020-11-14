package com.robin1.portfolio.data.source

class Repository(
    remoteDataSource: DataSource
) : DataSource {

    companion object {

        private var INSTANCE: Repository? = null

        @JvmStatic
        fun getInstance(remoteDataSource: DataSource) =
            INSTANCE
                ?: synchronized(Repository::class.java) {
                    INSTANCE
                        ?: Repository(remoteDataSource).also { INSTANCE = it }
                }
    }
}