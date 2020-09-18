package com.paul9834.spotifymvvm.ui.viewmodel.fragments.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.paul9834.spotifymvvm.R
import com.paul9834.spotifymvvm.data.DataSourceImplementation
import com.paul9834.spotifymvvm.domain.repository.product.ProductRepositoryImpl
import com.paul9834.spotifymvvm.remote.Resource
import com.paul9834.spotifymvvm.ui.viewmodel.ProductViewModel
import com.paul9834.spotifymvvm.ui.viewmodel.base.VMFactory

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val productViewModel by activityViewModels<ProductViewModel> {
        VMFactory(
            ProductRepositoryImpl(DataSourceImplementation())
        )
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupObserver()

    }
    fun setupObserver () {
        productViewModel.productlist.observe(viewLifecycleOwner, Observer { result ->
            when(result) {
                is Resource.Loading -> { }
                is Resource.Success -> {
                    Log.e("Result", "${result.data}")
                }
                is Resource.Failure -> {
                    Log.e("Result", "${result.exception}")
                }
            }
        })

    }
}