package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class PrimeNumbersFirst {
    public static boolean isPrime(int n){
        if (n<2) return false;
        if (n==2 || n==3) return true;
        if (n%2==0 || n%3==0) return false;
        for (int i=5;i*i<=n;i+=6){
            if (n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int count=0;
        for (Integer integer:arr){
            if (isPrime(integer)){
                count++;
            }
        }
        System.out.println(count);
    }
}
