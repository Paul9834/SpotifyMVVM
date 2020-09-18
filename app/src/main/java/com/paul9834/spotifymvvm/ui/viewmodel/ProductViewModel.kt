package com.paul9834.spotifymvvm.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.paul9834.spotifymvvm.domain.repository.product.ProductRepository
import com.paul9834.spotifymvvm.remote.Resource
import kotlinx.coroutines.Dispatchers
import java.lang.Exception

class ProductViewModel (private val productRepository: ProductRepository) : ViewModel(){

    val productlist = liveData(Dispatchers.IO) {
        emit(Resource.Loading())
        try {
            val productList = productRepository.getAPIList()

            if (productList is Resource.Success) {
                if (productList.data.isNotEmpty()) {
                    emit(productList)
                } else {
                    emit(Resource.Failure(Exception("No data")))
                }
            }
        } catch (e: Exception) {

            val exception = e

            emit(Resource.Failure(e))
        }
    }


}