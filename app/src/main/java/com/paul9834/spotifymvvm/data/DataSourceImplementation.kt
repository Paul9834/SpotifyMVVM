package com.paul9834.spotifymvvm.data

import com.paul9834.spotifymvvm.data.model.Product
import com.paul9834.spotifymvvm.data.model.ProductItem
import com.paul9834.spotifymvvm.domain.webservice.DataSource
import com.paul9834.spotifymvvm.remote.Resource

class DataSourceImplementation : DataSource {

    override suspend fun getAPIList(): Resource<List<ProductItem>> {
        TODO("Not yet implemented")
    }

    override suspend fun postProduct(product: Product): Any {
        TODO("Not yet implemented")
    }
}