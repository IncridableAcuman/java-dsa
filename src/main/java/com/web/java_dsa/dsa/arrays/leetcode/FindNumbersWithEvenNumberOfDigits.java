package com.web.java_dsa.dsa.arrays.leetcode;

import java.util.Scanner;

public class FindNumbersWithEvenNumberOfDigits {
    public static int countingDigit(int num){
        int count=0;
        while ( num > 0){
            num/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
//        1295. Find Numbers with Even Number of Digits
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        int count=0;
        for (Integer num : nums){
            if (countingDigit(num) %2 ==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
