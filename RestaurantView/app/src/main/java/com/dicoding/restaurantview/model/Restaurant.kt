package com.dicoding.restaurantview.model

import com.dicoding.restaurantview.model.CustomerReviewsItem
import com.google.gson.annotations.SerializedName

class Restaurant {
    @SerializedName("customerReviews")
    val customerReviews: List<CustomerReviewsItem>? = null

    @SerializedName("pictureId")
    val pictureId: String? = null

    @SerializedName("name")
    val name: String? = null

    @SerializedName("rating")
    val rating: Any? = null

    @SerializedName("description")
    val description: String? = null

    @SerializedName("id")
    val id: String? = null
}