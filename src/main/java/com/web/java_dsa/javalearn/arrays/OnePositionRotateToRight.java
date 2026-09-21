package com.web.java_dsa.javalearn.arrays;

import java.util.Scanner;

public class OnePositionRotateToRight {
    public static void reverse(int[] arr,int left,int right){
        while ( left < right ){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void rightRotate(int[] arr,int d){
        int n = arr.length;
        d = d % n;

        reverse(arr,0,n - 1);

        reverse(arr,0,d - 1);

        reverse(arr,d,n - 1);
    }
    public static void main(String[] args) {
        // Massivning barcha elementlarini bir pozitsiyaga o‘ngga suring.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        rightRotate(arr,1);
        for(Integer integer : arr){
            System.out.print(integer + " ");
        }
    }
}
