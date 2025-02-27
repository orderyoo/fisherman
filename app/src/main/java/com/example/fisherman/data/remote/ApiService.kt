package com.example.fisherman.data.remote

import com.example.fisherman.data.model.entity.News
import com.example.fisherman.data.model.entity.NewsDetails
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("/api/news")
    suspend fun getNews(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): List<News>

    @GET("news_details")
    suspend fun getNewsDetails(): NewsDetails
}