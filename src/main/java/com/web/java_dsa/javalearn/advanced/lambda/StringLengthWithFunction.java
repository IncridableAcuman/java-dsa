package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.Scanner;
import java.util.function.Function;

public class StringLengthWithFunction {
    public static void main(String[] args) {
        // 13. Function<String, Integer>
        //
        //String qabul qilib, uning uzunligini qaytaruvchi Function yarating.
        //
        //"Spring Boot" → 11
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        Function<String,Integer> function = String::length;
        System.out.println(function.apply(name));
    }
}
