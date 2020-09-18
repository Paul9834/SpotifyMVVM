package com.paul9834.spotifymvvm.remote

import com.google.gson.GsonBuilder
import com.paul9834.spotifymvvm.domain.webservice.ClientAPI
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    val apiclient: ClientAPI by lazy {
        Retrofit.Builder()
            .baseUrl("http://192.168.0.5:5000/")
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build().create(ClientAPI::class.java)

    }
}