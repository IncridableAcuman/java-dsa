package com.web.java_dsa.dsa.arrays.array_traversal;

import java.util.Scanner;

public class MassivniTeskariQilish {
    public static void main(String[] args) {
//                Massiv elementlarini teskari tartibda travers qiling.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (Integer i : arr){
            i = scanner.nextInt();
        }
        int i = arr.length - 1;
        while (i>=0){
            System.out.print(arr[i] + " ");
            i--;
        }
    }
}
