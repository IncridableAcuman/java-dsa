package com.web.java_dsa.javalearn.arrays;

import java.util.HashSet;
import java.util.Scanner;

public class MassivBirlashmasi {
    public static void main(String[] args) {
        // Ikki massivning birlashmasini hosil qiling.
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
        HashSet<Integer> set = new HashSet<>();
        for (Integer integer : nums1){
            set.add(integer);
        }
        for (Integer integer : nums2){
            set.add(integer);
        }
        Integer[] arr =set.toArray(new Integer[0]);
        for (Integer integer : arr){
            System.out.print(integer + " ");
        }
    }
}
