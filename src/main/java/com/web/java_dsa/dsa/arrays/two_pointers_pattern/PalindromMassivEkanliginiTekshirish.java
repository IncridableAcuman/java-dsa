package com.web.java_dsa.dsa.arrays.two_pointers_pattern;

import java.util.Objects;
import java.util.Scanner;

public class PalindromMassivEkanliginiTekshirish {
    public static boolean isPalindrome(int[] arr){
        int left = 0,right = arr.length - 1;
        while (left < right){
            if (arr[left] != arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
//        Palindrom massiv ekanligini tekshiring.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        boolean res = isPalindrome(arr);
        System.out.println(res);
    }
}
