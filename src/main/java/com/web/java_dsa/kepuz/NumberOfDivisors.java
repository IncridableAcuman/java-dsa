package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class NumberOfDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count=0;
        for (int i=1;i*i<=n;i++){
            if (n%i==0) count+=2;
            if (i*i==n) count--;
        }
        System.out.println(count);
    }
}
