package com.web.java_dsa.javalearn.advanced.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElements {
    public static void main(String[] args) {
        // 34. List<String> ichidagi duplicate elementlarni toping.
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("Rust");
        programmingLanguages.add("Go");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");

        programmingLanguages
                .stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
