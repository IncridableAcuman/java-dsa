package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class DivisibilityBy6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = n * ( n + 1 ) * ( n + 2 ) %6;
        System.out.println(res);
    }
}
