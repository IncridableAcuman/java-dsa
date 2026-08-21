package com.web.java_dsa.javalearn.advanced.regex;

import java.util.Scanner;

public class CheckingOnlySmallEnglishAlphabet {
    public static void main(String[] args) {
        // Berilgan String faqat ingliz harflaridan tashkil topganligini tekshiring.
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String little = "[a-z]+";
        System.out.println(str.matches(little));
    }
}
