package com.web.java_dsa.javalearn.advanced.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapGrouping {
    public static void main(String[] args) {
        /// 38. Map<String, Integer> berilgan. Bir xil qiymatga ega keylarni guruhlang.
        Map<String,Integer> cars = new HashMap<>();
        cars.put("bmw",300000);
        cars.put("mers",340000);
        cars.put("audi",320000);

        cars
                .entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey,Collectors.toList())))
                .entrySet()
                .forEach(System.out::println);
    }
}
