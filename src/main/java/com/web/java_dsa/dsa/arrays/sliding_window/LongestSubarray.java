package com.web.java_dsa.dsa.arrays.sliding_window;

import java.util.Scanner;

//         Eng uzun bir xil elementlardan tashkil topgan subarrayni toping.
public class LongestSubarray {
    public static int[] longestSubarray(int[] arr){
        int left=0;
        int maxLength=Integer.MAX_VALUE;
        for (int right=0;right<arr.length;right++){
            left++;
        }
        return new int[0];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int[] res = longestSubarray(arr);
        for (int x:res){
            System.out.print(x+" ");
        }
    }
}
