package com.example.ecommerce.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.ecommerce.R;
import com.example.ecommerce.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductListing extends AppCompatActivity implements RecyclerProductListing.ProductListDetailsInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_listing);
        initproductlisting();

        findViewById(R.id.tv_browser_productlist).setOnClickListener(view->{
            Intent intent=new Intent(ProductListing.this,SubCategory.class);
            startActivity(intent);
        });
        findViewById(R.id.bt_product_listing_login).setOnClickListener(view->{
            Intent intent=new Intent(ProductListing.this,LoginPage.class);
            startActivity(intent);
        });


    }
    public void initproductlisting(){
        List<Product> productListing = new ArrayList<Product>();
        productListing.add(new Product(1, "bat", "Cricket", 1000, "https://icatcare.org/app/uploads/2018/07/Thinking-of-getting-a-cat.png"));
        productListing.add(new Product(2, "ball", "football", 700, "https://icatcare.org/app/uploads/2018/07/Thinking-of-getting-a-cat.png"));
        productListing.add(new Product(3, "bat", "Cricket", 1000, "https://icatcare.org/app/uploads/2018/07/Thinking-of-getting-a-cat.png"));
        productListing.add(new Product(4, "bat", "Cricket", 1000, "https://icatcare.org/app/uploads/2018/07/Thinking-of-getting-a-cat.png"));


        RecyclerView recyclerView3 = findViewById(R.id.recyclerlist);
        RecyclerProductListing recyclerViewAdapter = new RecyclerProductListing(productListing, ProductListing.this);
        recyclerView3.setLayoutManager(new LinearLayoutManager(ProductListing.this));
        recyclerView3.setAdapter(recyclerViewAdapter);
    }

    @Override
    public void onUserClick(Product product) {
        Intent intent=new Intent(ProductListing.this,ProductDetails.class);
//        intent.putExtra("pid",product.getproductId());
        startActivity(intent);

    }

}