package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class Massiv3 {
    public static void main(String[] args) {
        // https://kep.uz/problems/372
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.next();
        }
        for (int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
