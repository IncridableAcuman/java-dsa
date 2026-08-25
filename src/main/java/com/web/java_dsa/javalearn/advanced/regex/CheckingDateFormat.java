package com.web.java_dsa.javalearn.advanced.regex;

import java.util.Scanner;

public class CheckingDateFormat {
    public static void main(String[] args) {
        // Berilgan sana DD/MM/YYYY formatiga mos kelishini tekshiring.
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        boolean result = date.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}");
        System.out.println(result);
    }
}
