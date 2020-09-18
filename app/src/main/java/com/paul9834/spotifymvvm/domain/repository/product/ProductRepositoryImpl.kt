package com.paul9834.spotifymvvm.domain.repository.product

import com.paul9834.spotifymvvm.data.model.Product
import com.paul9834.spotifymvvm.data.model.ProductItem
import com.paul9834.spotifymvvm.domain.webservice.DataSource
import com.paul9834.spotifymvvm.remote.Resource
import com.paul9834.spotifymvvm.remote.RetrofitClient

class ProductRepositoryImpl(private val dataSource: DataSource):  ProductRepository{

    override suspend fun getAPIList(): Resource<List<ProductItem>> {
        return Resource.Success(RetrofitClient.apiclient.getListProducts())
    }

    override suspend fun postProduct(product: Product): Any {
        TODO("Not yet implemented")
    }
}