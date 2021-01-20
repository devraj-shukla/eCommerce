package com.example.ecommerce.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.ecommerce.R;

import java.util.ArrayList;
import java.util.List;

public class SubCategory extends AppCompatActivity implements RecyclerSubCategoryAdaptor.SubCategoryDetailsInterface {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category);
        initApiHome();
        findViewById(R.id.backbutton2).setOnClickListener(view->{
            Intent intent=new Intent(SubCategory.this,ProductListing.class);
            startActivity(intent);
        });
    }
    public void initApiHome(){
        List<String> subCategory = new ArrayList<String>();

        subCategory.add("Bat");
        subCategory.add("Ball");
        subCategory.add("Gear");
        subCategory.add("Pitch");
        subCategory.add("Wickets");

        RecyclerView recyclerView3 = findViewById(R.id.recyclesubcategory);
        RecyclerSubCategoryAdaptor recyclerViewAdapter3 = new RecyclerSubCategoryAdaptor(subCategory , SubCategory.this);
        recyclerView3.setLayoutManager(new LinearLayoutManager(SubCategory.this));
        recyclerView3.setAdapter(recyclerViewAdapter3);
    }

    @Override
    public void onUserClick(String subCategory) {
        Intent intent=new Intent(SubCategory.this,ProductListing.class);
        startActivity(intent);
    }
}