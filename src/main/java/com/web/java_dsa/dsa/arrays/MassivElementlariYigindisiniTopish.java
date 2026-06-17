package com.web.java_dsa.dsa.arrays;

import java.util.Scanner;

public class MassivElementlariYigindisiniTopish {
    public static void main(String[] args) {
//        Massiv elementlari yig‘indisini hisoblang.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
