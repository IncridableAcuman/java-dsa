package com.web.java_dsa.javalearn.arrays;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
        // Massivni teskari tartibda joylashtiring.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i] = scanner.nextInt();
        }
        IntStream
                .iterate(nums.length - 1, i -> i >= 0, i -> i - 1)
                .map(i -> nums[i])
                .forEach(i -> System.out.print(i + " "));
    }
}
