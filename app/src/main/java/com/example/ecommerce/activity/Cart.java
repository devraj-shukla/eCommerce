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

public class Cart extends AppCompatActivity implements RecyclerCartAdaptor.ProductDetailsInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        initApiCart();
        findViewById(R.id.bt_loginpage_login).setOnClickListener(view->{
                    Intent intent=new Intent(Cart.this,HomePageDetails.class);
                    startActivity(intent);
                }
        );

        findViewById(R.id.button3).setOnClickListener(view->{
                    Intent intent=new Intent(Cart.this,Order.class);
                    startActivity(intent);
                }
        );
        findViewById(R.id.bt_cart_login).setOnClickListener(view->{
            Intent intent=new Intent(Cart.this,LoginPage.class);
            startActivity(intent);
        });
    }

    private void initApiCart() {
        List<Product> ProductList = new ArrayList<Product>();
        ProductList.add(new Product(1, "bat", "Cricket", 1000, "https://icatcare.org/app/uploads/2018/07/Thinking-of-getting-a-cat.png"));
        ProductList.add(new Product(2, "ball", "football", 700, "https://icatcare.org/app/uploads/2018/07/Thinking-of-getting-a-cat.png"));
        ProductList.add(new Product(3, "bat", "Cricket", 1000, "https://icatcare.org/app/uploads/2018/07/Thinking-of-getting-a-cat.png"));
        ProductList.add(new Product(4, "bat", "Cricket", 1000, "https://icatcare.org/app/uploads/2018/07/Thinking-of-getting-a-cat.png"));


        RecyclerView recyclerView = findViewById(R.id.recyclerView2);
        RecyclerCartAdaptor recyclerViewAdapter = new RecyclerCartAdaptor(ProductList, Cart.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(Cart.this));
        recyclerView.setAdapter(recyclerViewAdapter);

    }


    @Override
    public void onUserClick(Product product) {
        Intent intent=new Intent(Cart.this,ProductDetails.class);
//        intent.putExtra("pid",product.getproductId());
        startActivity(intent);

    }
}