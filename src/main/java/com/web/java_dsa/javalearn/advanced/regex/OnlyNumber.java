package com.web.java_dsa.javalearn.advanced.regex;

import java.util.Scanner;

public class OnlyNumber {
    // Berilgan String faqat raqamlardan tashkil topganligini tekshiring.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        //String numberDistance = "[0-9]+";
        String numberDistance = "\\d+";
        boolean regex = str.matches(numberDistance);
        System.out.println(regex);
    }
}
