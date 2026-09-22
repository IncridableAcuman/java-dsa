package com.web.java_dsa.javalearn.arrays;

import java.util.Scanner;

public class FindGeneralElements {
    public static void main(String[] args) {
        // Ikki massivning umumiy elementlarini toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums1 = new int[n];
        for (int i=0;i<n;i++){
            nums1[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] nums2 = new int[m];
        for (int i=0;i<m;i++){
            nums2[i] = scanner.nextInt();
        }
        for (int i : nums1){
            for (int j : nums2){
                if (i == j){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
