package com.example.ecommerce.activity;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.ecommerce.R;
import com.example.ecommerce.entities.ProductDetailsData;

public class ProductDetails extends AppCompatActivity {


    final ProductDetailsData productDetailsData = new ProductDetailsData(1,"SGBat","Sunil Gavaskar",1000,"Normal Size Bat made of English Willow.Good for Professional Cricket","https://images-na.ssl-images-amazon.com/images/I/51Cg8vax6jL._SL1200_.jpg",1);

    //    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

//        api need to fetch data for product detals

        initApiDetails();

        findViewById(R.id.zoomit).setOnClickListener(view -> {
            Intent intent = new Intent(ProductDetails.this, ZoomedImage.class);
            intent.putExtra("productImage", productDetailsData.getImage());
            startActivity(intent);

        });
        findViewById(R.id.bt_cart_productdetail).setOnClickListener(view->{
            Intent intent=new Intent(ProductDetails.this,Cart.class);
            startActivity(intent);
        });
    }

    public void initApiDetails() {
//        Retrofit retrofit = RetrofitBuilder.getInstance();
//        IApiDetail iApiProductInfo = retrofit.create(IApiDetail.class);
//        Call<ProductListResponse> responses = iApiProductInfo.get();

//        Callback<ProductListResponse> callback = new Callback<ProductListResponse>() {

//            @Override
//            public void onResponse(Call<ProductListResponse> call, Response<ProductListResponse> response) {
////                for ( ProductDetailsData product : response.body().getProducts()) {
//                    product.add(product);
//                }

//                RecyclerView recyclerView = findViewById(R.id.recyclerView);
//                RecyclerHomePageAdaptor recyclerViewAdapter = new RecyclerHomePageAdaptor(recommandProductList, HomePageDetails.this);
//                recyclerView.setLayoutManager(new LinearLayoutManager(HomePageDetails.this));
//                recyclerView.setAdapter(recyclerViewAdapter);


//            }

//            @Override
//            public void onFailure(Call<ProductListResponse> call, Throwable t) {
//                Toast.makeText(HomePageDetails.this, "error in fetching result" + t, Toast.LENGTH_LONG).show();
//            }
//
//        };
//        responses.enqueue(callback);

//        ProductDetailsData productDetailsData = new ProductDetailsData();
//        productDetailsData.setImage("https://images-na.ssl-images-amazon.com/images/I/51Cg8vax6jL._SL1200_.jpg");
//        productDetailsData.setDescription("Normal Size Bat made of English Willow.Good for Professional Cricket");
//        productDetailsData.setMerchantName("Sunil Gavaskar");
//        productDetailsData.setpId(1);
//        productDetailsData.setPrice(100000);
//        productDetailsData.setQuantity(1);
//        productDetailsData.setProductName("SGbat");
//
//        productDetailsData(1,"SGBat","Sunil Gavaskar",1000,"Normal Size Bat made of English Willow.Good for Professional Cricket","https://images-na.ssl-images-amazon.com/images/I/51Cg8vax6jL._SL1200_.jpg",1);

        TextView pName=findViewById(R.id.tv_productname_productdetail);
        pName.setText(productDetailsData.getProductName()+"");


        TextView mName=findViewById(R.id.tv_mname_productdetail);
        mName.setText(productDetailsData.getMerchantName()+"");


        TextView desc=findViewById(R.id.tv_description_productdetail);
        desc.setText(productDetailsData.getDescription()+"");


//        EditText quantity=findViewById(R.id.et_quantity);
//        quantity.setText(productDetailsData.getQuantity()+"");


        TextView price=findViewById(R.id.tv_price_productdetail);
        price.setText(productDetailsData.getPrice()+"");


        ImageView proimage=findViewById(R.id.zoomit);
        Glide.with(this)
                .load(productDetailsData.getImage())
                .placeholder(R.drawable.ic_baseline_cloud_download_24)
                .into(proimage);

        findViewById(R.id.bt_back_productdetail).setOnClickListener(view->{
                    Intent intent=new Intent(ProductDetails.this,HomePageDetails.class);
                    startActivity(intent);
                }
        );

    }
}
