package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class Massiv4 {
    public static void main(String[] args) {
        // https://kep.uz/problems/373
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int max = arr[0];
        for (Integer integer:arr){
            if (integer>max){
                max=integer;
            }
        }
        System.out.println(max);
    }
}
