package com.haticegunay.handone.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.haticegunay.handone.databinding.ProductCardDesignBinding
import com.haticegunay.handone.models.Product

class ProductsAdapter(private var productsList: ArrayList<Product>): RecyclerView.Adapter<ProductsAdapter.ProductCardDesign>() {

    class ProductCardDesign(val productCardDesignBinding: ProductCardDesignBinding): RecyclerView.ViewHolder(productCardDesignBinding.root)


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductsAdapter.ProductCardDesign {
        val layoutInflater = LayoutInflater.from(parent.context)
        val productCardDesignBinding = ProductCardDesignBinding.inflate(layoutInflater, parent, false)
        return ProductCardDesign(productCardDesignBinding)
    }

    override fun onBindViewHolder(holder: ProductsAdapter.ProductCardDesign, position: Int) {
        val product = productsList[position]

        //holder.productCardDesignBinding.ProductImageView.setImageResource(product.productImageUrl) //burası picasso ile resime çevirilecek
        holder.productCardDesignBinding.ProductProductNameTextView.text = product.productName
        holder.productCardDesignBinding.ProductPriceTextView.text = product.productPrice.toString()
    }

    override fun getItemCount(): Int {
        return productsList.size
    }

    //To-Do Adapterı aktifleştirmedik haberin olsun yiğidim

}