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

import java.util.List;

public class RecyclerSubCategoryAdaptor  extends RecyclerView.Adapter<RecyclerSubCategoryAdaptor.ViewHolder>{

    private List<String> subCategory;
    private SubCategoryDetailsInterface mSubCategoryDataInterface;


    public RecyclerSubCategoryAdaptor(List<String> subCategory, SubCategoryDetailsInterface mSubCategoryDataInterface) {
        this.subCategory = subCategory;
        this.mSubCategoryDataInterface = mSubCategoryDataInterface;


    }

    @NonNull
    @Override
    public RecyclerSubCategoryAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_recycler_home_page2, parent, false);
        return new RecyclerSubCategoryAdaptor.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String subCategory1= subCategory.get(position);
        holder.subCategory.setText(subCategory1);
        holder.rootview_subcategory.setOnClickListener((view -> mSubCategoryDataInterface.onUserClick(subCategory1)));


    }

    @Override
    public int getItemCount() {
        return subCategory.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView subCategory;

        private final View rootview_subcategory;

        public ViewHolder(View view) {
            super(view);
            rootview_subcategory=view;
            subCategory = view.findViewById(R.id.category);
//            add_to_cart=view.findViewById(R.id.buttoncart);
        }
    }

    public interface SubCategoryDetailsInterface{
        public void onUserClick(String subCategory);
    }

}