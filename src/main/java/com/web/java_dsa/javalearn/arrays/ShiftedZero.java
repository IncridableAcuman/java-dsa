package com.web.java_dsa.javalearn.arrays;

import java.util.Scanner;

public class ShiftedZero {
    public static void shiftedZero(int[] arr){
        int n = arr.length;
        int k=0;
        for (int j : arr) {
            if (j != 0) {
                arr[k++] = j;
            }
        }
        while (k < n){
            arr[k++]=0;
        }
        for (Integer integer : arr){
            System.out.print(integer + " ");
        }
    }
    public static void main(String[] args) {
        // Massivdagi barcha 0 larni oxiriga o'tkazing.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        shiftedZero(arr);
    }
}
