package com.example.ecommerce.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ecommerce.R;
import com.example.ecommerce.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class RecyclerHomePageAdaptor2  extends RecyclerView.Adapter<RecyclerHomePageAdaptor2.ViewHolder>{

    private List<String> categoryList;
    private CategoryDetailsInterface mCategoryDataInterface;


    public RecyclerHomePageAdaptor2(List<String> category, CategoryDetailsInterface mCategoryDataInterface) {
        this.categoryList = category;
        this.mCategoryDataInterface = mCategoryDataInterface;


    }

    @NonNull
    @Override
    public RecyclerHomePageAdaptor2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_recycler_home_page2, parent, false);
        return new RecyclerHomePageAdaptor2.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String category2= categoryList.get(position);
        holder.category.setText(category2);
        holder.rootview_category.setOnClickListener((view -> mCategoryDataInterface.onUserClick1(category2)));


    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView category;

        private final View rootview_category;

        public ViewHolder(View view) {
            super(view);
            rootview_category=view;
            category = view.findViewById(R.id.category);
//            add_to_cart=view.findViewById(R.id.buttoncart);
        }
    }

    public interface CategoryDetailsInterface{
        public void onUserClick1(String category);
    }

}