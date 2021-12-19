package com.haticegunay.handone.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.google.type.Money
import java.io.Serializable

data class Product(@SerializedName("docId") @Expose var docId: String,
                   @SerializedName("product_name") @Expose var productName: String,
                   @SerializedName("product_quantity") @Expose var productQuantity: Int,
                   @SerializedName("product_price") @Expose var productPrice: Money,
                   @SerializedName("product_description") @Expose var productDescription: String,
                   @SerializedName("product_image_url") @Expose var productImageUrl: String
): Serializable {

}