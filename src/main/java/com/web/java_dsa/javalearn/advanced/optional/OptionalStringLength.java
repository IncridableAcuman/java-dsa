package com.web.java_dsa.javalearn.advanced.optional;

import java.util.Optional;

public class OptionalStringLength {
    public static void main(String[] args) {
        // 2. Optional<String> ichidagi String uzunligini qaytaring. Qiymat bo‘lmasa 0 qaytarsin.
        Optional<String> optional = Optional.of("Uzbekistan");
        optional
                .stream()
                .map(String::length)
                .forEach(System.out::println);
    }
}
