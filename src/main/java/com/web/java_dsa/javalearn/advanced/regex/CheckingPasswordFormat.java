package com.web.java_dsa.javalearn.advanced.regex;

import java.util.Scanner;

public class CheckingPasswordFormat {
    public static void main(String[] args) {
        // Berilgan password kamida 8 ta belgidan iborat bo‘lib,
        // kamida bitta katta harf, kichik harf, raqam va maxsus belgiga ega ekanligini tekshiring.
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        boolean result = password.matches("[A-Za-z0-9!@#$%^&]{8}");
        System.out.println(result);
    }
}
