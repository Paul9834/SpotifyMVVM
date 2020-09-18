package com.paul9834.spotifymvvm.domain.repository.product

import com.paul9834.spotifymvvm.data.model.Product
import com.paul9834.spotifymvvm.data.model.ProductItem
import com.paul9834.spotifymvvm.remote.Resource

interface ProductRepository {

    suspend fun getAPIList(): Resource<List<ProductItem>>

    suspend fun postProduct(product: Product): Any

}