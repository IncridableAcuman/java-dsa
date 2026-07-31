package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class MassivElementlari {
    public static void main(String[] args) {
        // https://kep.uz/problems/1481
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        boolean a = true, b = false;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i : arr) {
            if (a) {
                if (i == x) {
                    a = false;
                }
                if (i % 2 != 0) {
                    b = true;
                    System.out.print(i + " ");
                } else {
                    sum += i;
                }
            } else {
                sum += i;
            }
        }
        if (b){
            System.out.println();
        }
        System.out.println(sum);
    }
}
