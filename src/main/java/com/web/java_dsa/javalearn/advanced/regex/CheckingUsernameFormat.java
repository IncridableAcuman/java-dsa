package com.web.java_dsa.javalearn.advanced.regex;

import java.util.Scanner;

public class CheckingUsernameFormat {
    public static void main(String[] args) {
        // Username 5–15 belgidan iborat bo‘lib, faqat harf, raqam va _ belgilaridan tashkil topganligini tekshiring.
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        boolean result = username.matches("[A-Za-z0-9_]{5,15}");
        System.out.println(result);
    }
}
