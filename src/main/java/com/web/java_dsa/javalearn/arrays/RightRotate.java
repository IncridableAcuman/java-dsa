package com.web.java_dsa.javalearn.arrays;

import java.util.Scanner;

public class RightRotate {
    public static void reverse(int[] arr, int left,int right){
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void rightRotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;

        reverse(arr,0,n-1);

        reverse(arr,0,k-1);

        reverse(arr,k,n-1);
    }
    public static void main(String[] args) {
        // Massivni k pozitsiyaga o‘ngga rotate qiling.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        rightRotate(arr,k);
        for (Integer integer : arr){
            System.out.print(integer + " ");
        }
    }
}
