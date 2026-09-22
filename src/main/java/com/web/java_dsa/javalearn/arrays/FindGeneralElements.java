package com.web.java_dsa.javalearn.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class FindGeneralElements {
    public static void main(String[] args) {
        // Ikki massivning umumiy elementlarini toping. // kesishma
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
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (Integer integer : nums1){
            set1.add(integer);
        }
        for (Integer integer : nums2){
            set2.add(integer);
        }
        /*
        for (int i : nums1){
            for (int j : nums2){
                if (i == j){
                    System.out.print(i + " ");
                }
            }
        }

         */
        set1.retainAll(set2);
        Integer[] arr = set1.toArray(new Integer[0]);
        Arrays
                .stream(arr)
                .forEach(integer -> System.out.print(integer + " "));
    }
}
