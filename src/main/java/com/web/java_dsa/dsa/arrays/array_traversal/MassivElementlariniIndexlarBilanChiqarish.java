package com.web.java_dsa.dsa.arrays.array_traversal;

import java.util.Scanner;

public class MassivElementlariniIndexlarBilanChiqarish {
    public static void main(String[] args) {
//         Massivdagi barcha elementlarni indekslari bilan chiqaring.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.println(i + "-index => " + arr[i]);
        }
    }
}
