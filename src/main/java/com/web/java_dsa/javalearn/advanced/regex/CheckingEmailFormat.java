package com.web.java_dsa.javalearn.advanced.regex;

import java.util.Scanner;

public class CheckingEmailFormat {
    public static void main(String[] args) {
        // Berilgan String email manzil formatiga mos kelishini tekshiring.
        Scanner scanner = new Scanner(System.in);
        String email = scanner.next();
        boolean result = email.matches("^.*@gmail.com$");
        System.out.println(result);
    }
}
