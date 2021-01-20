package com.example.ecommerce;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBuilder {
    private static Retrofit instance;

    private RetrofitBuilder() {
    }

    public static Retrofit getInstance() {
        if (instance == null) {
            synchronized (com.example.ecommerce.RetrofitBuilder.class) {
                if (instance == null) {
                    instance = new Retrofit.Builder()
                            .baseUrl("http://127.0.0.1:8080/")
                            .addConverterFactory(GsonConverterFactory.create())
                            .client(new OkHttpClient())
                            .build();
                }
            }
        }
        return instance;
    }
}
