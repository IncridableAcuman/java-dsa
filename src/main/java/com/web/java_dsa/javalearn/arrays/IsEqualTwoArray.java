package com.web.java_dsa.javalearn.arrays;

import java.util.Scanner;

public class IsEqualTwoArray {
    public static void main(String[] args) {
        // Ikki massiv bir-biriga tengligini tekshiring.
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
        int count=0;
        for (int i : nums1){
            for (int j : nums2){
                if (i == j){
                    count++;
                }
            }
        }
        System.out.print(count == n ? "Yes" : "No");
    }
}
