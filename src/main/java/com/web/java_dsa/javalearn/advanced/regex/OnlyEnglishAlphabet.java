package com.web.java_dsa.javalearn.advanced.regex;

import java.util.Scanner;

public class OnlyEnglishAlphabet {
    public static void main(String[] args) {
        // Berilgan String faqat raqamlardan tashkil topganligini tekshiring.
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String englishAlphabetical = "[A-Za-z]+";
        System.out.println(str.matches(englishAlphabetical));
    }
}
