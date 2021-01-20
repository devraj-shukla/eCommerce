package com.example.ecommerce.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.ecommerce.entities.Product;
import com.example.ecommerce.R;
import com.example.ecommerce.entities.ProductDetailsData;

public class ZoomedImage extends AppCompatActivity {

//    Product product=new Product();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String url = getIntent().getStringExtra("productImage");
        setContentView(R.layout.activity_zoomed_image);

        ImageView imageView = findViewById(R.id.zoomin);
        Glide.with(this)
                .load(url)
                .placeholder(R.drawable.ic_baseline_cloud_download_24)
                .into(imageView);
        findViewById(R.id.backbutton).setOnClickListener(view->{
            Intent intent=new Intent(ZoomedImage.this,ProductDetails.class);
            startActivity(intent);
        }
        );
    }
}