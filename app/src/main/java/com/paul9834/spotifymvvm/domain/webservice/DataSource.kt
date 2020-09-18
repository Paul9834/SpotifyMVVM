package com.paul9834.spotifymvvm.domain.webservice

import com.paul9834.spotifymvvm.data.model.Product
import com.paul9834.spotifymvvm.data.model.ProductItem
import com.paul9834.spotifymvvm.remote.Resource


interface DataSource {

    suspend fun getAPIList(): Resource<List<ProductItem>>

    suspend fun postProduct(product: Product): Any


}