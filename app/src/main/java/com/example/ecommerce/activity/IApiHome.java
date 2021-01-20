package com.example.ecommerce.activity;

import com.example.ecommerce.entities.Product;
import com.example.ecommerce.responses.ProductListResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface IApiHome {
    @GET("spolub/recommend")
    Call<ProductListResponse> getRecommend();

    @POST("spolub/addtocart/")
    Call<Product> addtoCart(@Body int userID, @Body int productID, @Body int merchantID, @Body int quantity);

    // AddProductToCart(uID, pID, mID, qty)

}

