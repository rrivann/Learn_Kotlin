package com.dicoding.restaurantview

import com.google.gson.annotations.SerializedName

class RestaurantResponse {
    @SerializedName("restaurant")
    val restaurant: Restaurant? = null

    @SerializedName("error")
    val isError = false

    @SerializedName("message")
    val message: String? = null
}