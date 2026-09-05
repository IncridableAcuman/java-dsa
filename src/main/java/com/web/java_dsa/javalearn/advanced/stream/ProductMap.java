package com.web.java_dsa.javalearn.advanced.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductMap {
    public static void main(String[] args) {
        // 28. Product → price Map
        //Laptop  → 1200
        //Phone   → 800
        //Monitor → 400
        List<Product> products = new ArrayList<>();
        products.add(new Product("Banana",12000));
        products.add(new Product("Apple",15000));
        products.add(new Product("Watermelon",3000));
        products.add(new Product("Melon",2000));

        Map<String,Double> map = products
                .stream()
                .collect(Collectors.toMap(Product::getName,Product::getPrice));
        for (Map.Entry<String, Double> entry : map.entrySet()){
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }
}
