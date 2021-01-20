package com.example.ecommerce;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IApiHome2 {

    @GET("Spolub/categories")
    Call<List<String>> getCategory();
}
