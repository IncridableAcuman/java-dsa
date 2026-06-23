package com.web.java_dsa.dsa.arrays.two_pointers_pattern;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DublicateElementlarniUchirish {
    public static int removeDuplicates(int[] arr){
        int i=0;
        for (int j=1;j<arr.length;j++){
            if (arr[j] != arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
//        Tartiblangan massivdan duplicate elementlarni olib tashlang.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        int len = removeDuplicates(nums);
//        Set<Integer> set = new HashSet<>();
//        for (Integer num: nums){
//            set.add(num);
//        }
//        for (Integer st: set){
//            System.out.print(st + " ");
//        }
//        System.out.println("<======================================>");
        for (int i=0;i<len;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
