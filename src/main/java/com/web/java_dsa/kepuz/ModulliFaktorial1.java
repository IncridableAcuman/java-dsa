package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class ModulliFaktorial1 {
    public static int factorial(int n){
        if (n==1) return 1;

        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        // https://kep.uz/problems/209
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        System.out.println(factorial(n));
    }
}
