package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class OddElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int sum=0;
        for (int i=0;i<n;i++){
            if (arr[i]%2==1){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
