package com.web.java_dsa.javalearn.advanced.regex;

import java.util.Scanner;

public class CheckingHttpOrHttpsURLFormat {
    public static void main(String[] args) {
        // Berilgan String http yoki https bilan boshlanuvchi URL ekanligini tekshiring.
        Scanner scanner = new Scanner(System.in);
        String url = scanner.next();
        boolean result = url.matches("^(http|https)://.*");
        System.out.println(result);
    }
}
