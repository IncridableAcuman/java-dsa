package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        if (n==1) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = factorial(n);
        System.out.println(res);
    }
}
