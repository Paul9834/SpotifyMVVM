package com.paul9834.spotifymvvm.ui.viewmodel.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.paul9834.spotifymvvm.domain.repository.product.ProductRepository

class VMFactory (private val productRepository: ProductRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(ProductRepository::class.java).newInstance(productRepository)
    }
}