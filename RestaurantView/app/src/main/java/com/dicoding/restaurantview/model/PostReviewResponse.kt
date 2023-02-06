package com.dicoding.restaurantview.model

import com.dicoding.restaurantview.model.CustomerReviewsItem
import com.google.gson.annotations.SerializedName

class PostReviewResponse {
    @SerializedName("customerReviews")
    val customerReviews: List<CustomerReviewsItem>? = null

    @SerializedName("error")
    val isError = false

    @SerializedName("message")
    val message: String? = null
}