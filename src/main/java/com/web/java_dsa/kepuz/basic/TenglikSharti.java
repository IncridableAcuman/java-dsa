package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class TenglikSharti {
    public static void main(String[] args) {
        // https://kep.uz/problems/1915
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(((a+b==c) || (a+c==b) || (b+c==a)) ? "Yes" : "No");
    }
}
