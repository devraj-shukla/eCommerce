package com.example.ecommerce.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.ecommerce.entities.Product;
import com.example.ecommerce.R;

import java.util.ArrayList;
import java.util.List;

public class HomePageDetails extends AppCompatActivity implements RecyclerHomePageAdaptor.ProductDetailsInterface,RecyclerHomePageAdaptor2.CategoryDetailsInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity);


        initApiHome();
        initApiHome1();
        findViewById(R.id.CartButton_1).setOnClickListener(view->{
            Intent intent=new Intent(HomePageDetails.this,Cart.class);
            startActivity(intent);
        });

        findViewById(R.id.bt_home_login).setOnClickListener(view->{
            Intent intent=new Intent(HomePageDetails.this,LoginPage.class);
            startActivity(intent);
        });

    }

    public void initApiHome(){
//        Retrofit retrofit = RetrofitBuilder.getInstance();
//        IApiHome iApiRecommend = retrofit.create(IApiHome.class);
//        Call<ProductListResponse> responses = iApiRecommend.getRecommend();
//
//        Callback<ProductListResponse> callback = new Callback<ProductListResponse>() {
//
//            @Override
//            public void onResponse(Call<ProductListResponse> call, Response<ProductListResponse> response) {
//                for ( Product product : response.body().getProducts()) {
//                    recommandProductList.add(product);
//                }



        List<Product> recommandProductList = new ArrayList<Product>();
        recommandProductList.add(new Product(1, "bat", "Cricket", 1000, "https://icatcare.org/app/uploads/2018/07/Thinking-of-getting-a-cat.png"));
        recommandProductList.add(new Product(2, "ball", "football", 700, "https://icatcare.org/app/uploads/2018/07/Thinking-of-getting-a-cat.png"));
        recommandProductList.add(new Product(3, "bat", "Cricket", 1000, "https://icatcare.org/app/uploads/2018/07/Thinking-of-getting-a-cat.png"));
        recommandProductList.add(new Product(4, "bat", "Cricket", 1000, "https://icatcare.org/app/uploads/2018/07/Thinking-of-getting-a-cat.png"));


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
                RecyclerHomePageAdaptor recyclerViewAdapter = new RecyclerHomePageAdaptor(recommandProductList, HomePageDetails.this);
                recyclerView.setLayoutManager(new LinearLayoutManager(HomePageDetails.this));
                recyclerView.setAdapter(recyclerViewAdapter);
            }

//            @Override
//            public void onFailure(Call<ProductListResponse> call, Throwable t) {
//                Toast.makeText(HomePageDetails.this, "error in fetching result" + t, Toast.LENGTH_LONG).show();
//            }
//
//        };
//        responses.enqueue(callback);
//
//
//    }


     public void initApiHome1(){
         List<String> category = new ArrayList<String>();

         category.add("Cricket");
         category.add("Football");
         category.add("Badminton");
         category.add("Hockey");

         RecyclerView recyclerView2 = findViewById(R.id.categoryview);
         RecyclerHomePageAdaptor2 recyclerViewAdapter2 = new RecyclerHomePageAdaptor2(category , HomePageDetails.this);
         recyclerView2.setLayoutManager(new LinearLayoutManager(HomePageDetails.this));
         recyclerView2.setAdapter(recyclerViewAdapter2);

        }


//    @Override
//    public void add_to_cart(int productId) {
//        Retrofit retrofit = RetrofitBuilder.getInstance();
//        IApiHome iapiaddcart = retrofit.create(IApiHome.class);
//        int userID = 1; // TODO: get from shared prefs
//        Call<BasicResponse> response = iapiaddcart.addtoCart(userID, productId, );
//        response.enqueue(new Callback<BasicResponse>() {
//            @Override
//            public void onResponse(Call<BasicResponse> call, Response<BasicResponse> response) {
//                Toast.makeText(HomePageDetails.this, "Your item is in the cart", Toast.LENGTH_SHORT).show();
//
//
//            }
//
//            @Override
//            public void onFailure(Call<BasicResponse> call, Throwable t) {
//                Toast.makeText(HomePageDetails.this, "Out of Stock", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//    }


    @Override
    public void onUserClick(Product product) {
        Intent intent=new Intent(HomePageDetails.this,ProductDetails.class);
//        intent.putExtra("pid",product.getproductId());
        startActivity(intent);

    }

    @Override
    public void onUserClick1(String category) {
        Intent intent=new Intent(HomePageDetails.this,SubCategory.class);
        startActivity(intent);
    }
}