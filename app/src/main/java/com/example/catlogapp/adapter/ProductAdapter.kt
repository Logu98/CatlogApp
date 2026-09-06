package com.example.catlogapp.adapter

import com.example.catlogapp.model.Product

class ProductAdapter {
    private val productList = mutableListOf<Product>(
    ) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

        override fun getItemCount(): Int {
            return productList.size
        }
        override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
            val product = productList[position]
            holder.itemView.findViewById<TextView>(R.id.tv_product_name).text = product.title
        }

        class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
            return ProductViewHolder(view)
        }
        inner class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val productImage: ImageView = itemView.findViewById(R.id.iv_product_image)
            val productName: TextView = itemView.findViewById(R.id.tv_product_name)
        }
    }
}