package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class DigitalRoot {
    public static int sumDigit(int n){
        int sum = 0;
        while (n!=0){
            int r = n%10;
            sum+=r;
            n/=10;
        }
        return sum;
    }
    public static int digitalRoot(int n){
     if (n<10){
         return n;
     }
     return digitalRoot(sumDigit(n));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = digitalRoot(n);
        System.out.println(res);
    }
}
