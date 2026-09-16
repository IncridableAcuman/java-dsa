package com.web.java_dsa.javalearn.advanced.collections;

import java.util.HashMap;
import java.util.Map;

public class FindMaxValue {
    public static void main(String[] args) {
        /// 32. Map<String, Integer> berilgan. Eng katta qiymatga ega elementni toping.
        Map<String,Integer> cars = new HashMap<>();
        cars.put("volvo",1990);
        cars.put("audi",1998);
        cars.put("mers",1999);
        cars.put("bmw",2000);

        cars
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);
    }
}
