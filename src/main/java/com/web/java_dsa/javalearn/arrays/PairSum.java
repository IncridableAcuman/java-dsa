package com.web.java_dsa.javalearn.arrays;

import java.util.HashSet;
import java.util.Scanner;

public class PairSum {
    public static boolean pairSum(int[] nums,int target){
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            int complement = target - num;
            if (set.contains(complement)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        // Massivda yig‘indisi target ga teng bo‘lgan juftlik mavjudligini aniqlang.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        if (pairSum(arr,target)){
            System.out.println("Yig'indisi " + target + " ga teng juftliklar mavjud.");
        } else {
            System.out.println("Bunday juftlik mavjud emas!");
        }
    }
}
