package com.web.java_dsa.javalearn.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMinElement {
    public static void main(String[] args) {
        // Massivdagi ikkinchi eng kichik elementni toping.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);
        System.out.println(nums[1]);
    }
}
