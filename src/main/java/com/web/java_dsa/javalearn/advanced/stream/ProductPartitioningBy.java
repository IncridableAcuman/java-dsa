package com.web.java_dsa.javalearn.advanced.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductPartitioningBy {
    public static void main(String[] args) {
        // 24. Productlarni narx bo‘yicha ajrating
        //class Product {
        //    String name;
        //    double price;
        //}
        //
        //Productlarni:
        //
        //price >= 100 → expensive
        //price < 100  → cheap
        //
        //qilib ikki guruhga ajrating.

        List<Product> products = new ArrayList<>();
        products.add(new Product("Banana",12000));
        products.add(new Product("Apple",15000));
        products.add(new Product("Watermelon",3000));
        products.add(new Product("Melon",2000));

        Map<Boolean,List<Product>> map = products
                .stream()
                .collect(Collectors.partitioningBy(product -> product.getPrice() > 2000));

        for (Map.Entry<Boolean,List<Product>> entry : map.entrySet()){
            String partitioning = entry.getKey() ? "Price > 2000" : "Price <= 2000";
            System.out.println(
                    partitioning + " -> " +
                            entry
                                    .getValue()
                                    .stream()
                                    .map(product -> product.getName() + "(" + product.getPrice() + ")")
                                    .toList()
            );

        }
    }
}
