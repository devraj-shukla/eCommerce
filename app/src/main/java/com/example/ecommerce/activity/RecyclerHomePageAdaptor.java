package com.example.ecommerce.activity;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.ecommerce.entities.Product;
import com.example.ecommerce.R;

import java.util.List;

public class RecyclerHomePageAdaptor extends RecyclerView.Adapter<RecyclerHomePageAdaptor.ViewHolder> {

    private List<Product> mProductDataList;
    private ProductDetailsInterface mProductDataInterface ;




    public RecyclerHomePageAdaptor(List<Product> recommendProductList, ProductDetailsInterface mProductDataInterface ) {
        this.mProductDataList = recommendProductList;
        this.mProductDataInterface = mProductDataInterface;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_recycler__home_page__adaptor, parent, false);
        return new ViewHolder(view);
    }


    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Product productData = mProductDataList.get(position);
        holder.name_product.setText(productData.getProductName());
        holder.price_product.setText(String.valueOf(productData.getPrice()));
//        holder.category_product.setText(productData.getCategory());
        //holder.image_product.(productData.getProductImages());

        Glide.with(holder.image_product.getContext())
                .load(productData.getProductImages())
                .placeholder(R.drawable.ic_baseline_cloud_download_24)
                .into(holder.image_product);
        
//        holder.add_to_cart.setOnClickListener((view -> mProductDataInterface.add_to_cart(productData.getpId())));
        holder.rootview_product.setOnClickListener((view -> mProductDataInterface.onUserClick(productData)));
    }

    @Override
    public int getItemCount() {
        return mProductDataList.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView name_product;
        private final TextView price_product;
//        private final TextView category_product;
        private final ImageView image_product;
//        private final Button add_to_cart;
        private final View rootview_product;

        public ViewHolder(View view) {
            super(view);
            rootview_product=view;
            image_product=view.findViewById(R.id.iv_image_homepage);
            name_product = view.findViewById(R.id.tv_nameproduct_homepage);
            price_product = view.findViewById(R.id.tv_price_homepage);
//            category_product=view.findViewById(R.id.category);
//            add_to_cart=view.findViewById(R.id.buttoncart);
        }
    }

    public interface ProductDetailsInterface{
//        public void add_to_cart(int productId);
        public void onUserClick(Product product);

    }

}