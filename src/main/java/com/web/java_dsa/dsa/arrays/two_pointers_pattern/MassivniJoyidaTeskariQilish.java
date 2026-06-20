package com.web.java_dsa.dsa.arrays.two_pointers_pattern;

import java.util.Scanner;

public class MassivniJoyidaTeskariQilish {
    public static void main(String[] args) {
//         Massivni joyida (in-place) teskari qiling.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
//        for (int i=0;i<n;i++){
//            for (int j=i+1;j<n;j++){
//                int t = nums[i];
//                nums[i]=nums[j];
//                nums[j]=t;
//            }
//        }
        int left = 0, right = nums.length - 1;
        while (left < right){
            int t = nums[left];
            nums[left]=nums[right];
            nums[right]=t;
            left++;
            right--;
        }
        for (Integer num: nums){
            System.out.print(num + " ");
        }
    }
}
