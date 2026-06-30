package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class ProductOfSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 1,s=0;
        for (int i=1;i<=n;i++){
            s+=i;
            sum*=s;
        }
        System.out.println(sum);
    }
}
