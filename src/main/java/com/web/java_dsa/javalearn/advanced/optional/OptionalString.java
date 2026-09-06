package com.web.java_dsa.javalearn.advanced.optional;

import java.util.*;
import java.util.stream.Collectors;

public class OptionalString {
    public static void main(String[] args) {
        // 1. Optional<String> qabul qiluvchi metod yozing. Agar qiymat mavjud bo‘lsa, uni ekranga chiqaring.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            System.out.print(i + "-fruit=");
            String k = scanner.next();
            list.add(k);
        }
        Optional<String> optional = list
                .stream()
                .max(Comparator.comparing(String::length));

        optional
                .ifPresent(System.out::println);
    }
}
