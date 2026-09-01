package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.Scanner;
import java.util.function.Supplier;

public class LambdaSupplier {
    public static void main(String[] args) {
        /*
        * Supplier<T>

          Hech qanday parametr olmaydi.

          Lekin qiymat qaytaradi.
        * */
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Supplier<String> supplier = ()-> str;
        System.out.println(supplier.get());
    }
}
