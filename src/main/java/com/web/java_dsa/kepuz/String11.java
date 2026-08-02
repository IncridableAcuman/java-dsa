package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class String11 {
    public static void main(String[] args) {
        // https://kep.uz/problems/397
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str.endsWith("CPython") ? "Yes" : "No");
    }
}
