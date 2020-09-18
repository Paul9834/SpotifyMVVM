package com.paul9834.spotifymvvm.domain.webservice

import com.paul9834.spotifymvvm.data.model.Product
import retrofit2.http.GET
import retrofit2.http.POST

interface ClientAPI {

    @GET("v1/api/stock")
    suspend fun getListProducts () : Product


    @POST("v1/api/order")
    suspend fun createOrder()

}