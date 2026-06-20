package com.web.java_dsa.dsa.arrays.two_pointers_pattern;

import java.util.Scanner;

public class DublicateElementlarniUchirish {
    public static void main(String[] args) {
//        Tartiblangan massivdan duplicate elementlarni olib tashlang.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        int left = 0, right = nums.length - 1;
    }
}
