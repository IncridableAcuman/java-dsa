package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.Scanner;

interface Checking {
    boolean pairOrOddNumber(int n);
}

public class CheckingNumberOfPairOrOddNumber {
    public static void main(String[] args) {
        // 3. Son juft yoki toqligini aniqlash
        //
        //Son qabul qilib, true/false qaytaruvchi lambda yarating.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        Checking checking = x-> x % 2 == 0;
        System.out.println(checking.pairOrOddNumber(n));
    }
}
