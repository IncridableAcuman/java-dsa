package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class ElementsOfStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double arithmetic = (double) (a + b) / 2;
        double geometric = Math.sqrt(a*b);
        double harmonic = (double) (2 * a * b) /(a+b);
        System.out.println(arithmetic);
        System.out.println(geometric);
        System.out.println(harmonic);
    }
}
