package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class KvadratSon {
    public static void main(String[] args) {
        // https://kep.uz/problems/420
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double x = Math.sqrt(n);
        int y = (int) Math.sqrt(n);
        System.out.println( (x-y)>0 ? "No" : "Yes");
    }
}
