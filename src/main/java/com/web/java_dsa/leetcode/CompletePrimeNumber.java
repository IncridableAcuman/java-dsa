package com.web.java_dsa.leetcode;

import java.util.Scanner;

public class CompletePrimeNumber {
    public static boolean checkingForPrimeNumber(int n){
        if (n < 2) return false;
        if (n == 2 || n==3) return true;
        if (n%2==0 || n%3==0) return false;
        for (int i=5;i*i<=n;i+=6){
            if (n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // https://leetcode.com/problems/complete-prime-number/description/
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int count=0;
        for (int i=0;i<str.length();i++){
           int x = str.charAt(i)-'0';
           if (checkingForPrimeNumber(x)){
               count++;
           }
        }
        System.out.println(count == str.length());
    }
}
