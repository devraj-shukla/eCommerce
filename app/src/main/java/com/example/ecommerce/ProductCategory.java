package com.example.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class ProductCategory {
    List<String> list=new ArrayList<>();

    public List<String> getList() {
        return list;
    }

    public ProductCategory(ArrayList<String> list) {
        this.list = list;
    }
}

