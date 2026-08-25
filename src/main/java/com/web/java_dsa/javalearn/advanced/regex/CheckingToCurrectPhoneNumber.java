package com.web.java_dsa.javalearn.advanced.regex;

import java.util.Scanner;

public class CheckingToCurrectPhoneNumber {
    public static void main(String[] args) {
        // Telefon raqami +998901234567 formatiga mos kelishini tekshiring.
        Scanner scanner = new Scanner(System.in);
        String phone = scanner.next();
        boolean result = phone.matches("^\\+998[0-9]{9}$");
        System.out.println(result);
    }
}
