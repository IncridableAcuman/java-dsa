package com.web.java_dsa.javalearn.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CountingPairNumbers {
    public static void main(String[] args) {
        // Massivdagi juft sonlar sonini aniqlang.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i] = scanner.nextInt();
        }
        int count = Math.toIntExact(Arrays
                .stream(nums)
                .filter(i -> i % 2 == 0)
                .count());
        System.out.println("Count: " + count);
    }
}
