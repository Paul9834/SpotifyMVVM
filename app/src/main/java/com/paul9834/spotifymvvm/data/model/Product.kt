package com.paul9834.spotifymvvm.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


class Product : ArrayList<ProductItem>()

@Parcelize
data class ProductItem(

    @SerializedName("id")
    val id: Int = 0,

    @SerializedName("createdAt")
    val createdAt: String = "",

    @SerializedName("updatedAt")
    val updatedAt: String = "",

    @SerializedName("name")
    val name: String = "",

    @SerializedName("description")
    val description: String = "",

    @SerializedName("img_url")
    val img_url: String = "",
    @SerializedName("price")
    val price: Int = 0

) : Parcelable