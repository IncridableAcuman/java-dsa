package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class KubDaraja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = (int) Math.cbrt(n);
        System.out.println((a * a * a) == n ? "Yes" : "No");
    }
}
