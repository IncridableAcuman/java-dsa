package com.web.java_dsa.javalearn.advanced.optional;

import java.util.Optional;

public class OptionalInteger {
    public static void main(String[] args) {
        // 3. Optional<Integer> ichidagi sonni 2 ga ko‘paytiring. Qiymat bo‘lmasa 0.

        Optional<Integer> optional = Optional.of(12);
        optional
                .ifPresent(x-> System.out.println(x  * 2));
    }
}
