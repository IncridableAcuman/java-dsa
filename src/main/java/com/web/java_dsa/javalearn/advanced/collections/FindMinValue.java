package com.web.java_dsa.javalearn.advanced.collections;

import java.util.HashMap;
import java.util.Map;

public class FindMinValue {
    public static void main(String[] args) {
        // 33. Map<String, Integer> berilgan. Eng kichik qiymatni toping.
        Map<String,Integer> cars = new HashMap<>();
        cars.put("volvo",1990);
        cars.put("audi",1998);
        cars.put("mers",1999);
        cars.put("bmw",2000);

        cars
                .entrySet()
                .stream()
                .min(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);
    }
}
