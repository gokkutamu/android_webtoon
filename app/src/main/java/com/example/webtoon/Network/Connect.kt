package com.example.webtoon.Network

import com.example.webtoon.Network.GET.GetHome
import com.google.gson.JsonObject
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*

interface Connect {
    @GET("/canvas/home")
    fun getHome(
        @Header("token") token: String,
        @Path("flag") flag: Int
    ): Call<GetHome>
}