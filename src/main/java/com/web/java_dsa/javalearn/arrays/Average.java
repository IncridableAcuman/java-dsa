package com.web.java_dsa.javalearn.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // Massiv elementlarining o‘rtacha qiymatini toping.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i] = scanner.nextInt();
        }
        double average = Arrays
                .stream(nums)
                .average().getAsDouble();
        System.out.println("Average: " + average);
    }
}
