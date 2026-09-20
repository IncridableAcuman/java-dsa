package com.web.java_dsa.javalearn.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Massiv elementlarining yig‘indisini hisoblang.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i] = scanner.nextInt();
        }
        int sum = Arrays
                .stream(nums)
                        .sum();
        System.out.println("Sum: " + sum);
    }
}
