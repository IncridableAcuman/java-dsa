package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class Massiv2 {
    public static void main(String[] args) {
        // https://kep.uz/problems/371
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        for (Integer integer:arr){
            if (integer%2==0){
                System.out.print(integer+" ");
            }
        }
    }
}
