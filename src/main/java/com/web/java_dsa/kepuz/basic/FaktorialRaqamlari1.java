package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class FaktorialRaqamlari1 {
    public static int fact(int n){
        if (n==1) return 1;
        return n * fact( n - 1 );
    }
    public static void main(String[] args) {
        // https://kep.uz/problems/883
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = String.valueOf(fact(n));
        System.out.println(str.length());
    }
}
