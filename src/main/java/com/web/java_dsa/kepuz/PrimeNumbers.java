package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class PrimeNumbers {
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
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=1;i<=n;i++){
            if (checkingForPrimeNumber(i)){
                System.out.print(i+" ");
            }
        }
    }
}
