package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.Scanner;

interface Length {
    int strLength(String str);
}

public class StringLength {
    public static void main(String[] args) {
        // 5. String uzunligini topish
        //
        //String qabul qilib, uning uzunligini qaytaruvchi lambda yozing.

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Length length = String::length;
        System.out.println(length.strLength(str));
    }
}
