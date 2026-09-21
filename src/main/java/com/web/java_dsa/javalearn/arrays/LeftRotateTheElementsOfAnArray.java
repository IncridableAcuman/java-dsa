package com.web.java_dsa.javalearn.arrays;

import java.util.Scanner;

public class LeftRotateTheElementsOfAnArray {
    public static void leftRotate1(int[] arr, int d){
        int n = arr.length;
        d = d % n;
        int k = 0;
        int[] temp = new int[n];
        for (int i = d; i < n; i++){
            temp[k++] = arr[i];
        }
        for (int i = 0; i < d; i++){
            temp[k++] = arr[i];
        }
        for (int i=0;i<n;i++){
            arr[i] = temp[i];
        }
    }
    public static void leftRotate2(int[] arr, int d){
        int n = arr.length;
        d = d % n;
        for (int j = 0; j < d; j++){
            int first = arr[0];
            for (int i = 0; i < n - 1; i++){
                arr[i] = arr[i+1];
            }
            arr[n-1]=first;
        }
    }

    public static int gdc(int a,int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void leftRotate3(int[] arr, int d){
        int n = arr.length;
        d = d % n;

        int g = gdc(n,d);
        for (int i = 0; i < g; i++){
            int temp = arr[i];
            int j = i;
            while (true){
                int k = j + d;

                if (k >= n){
                    k -= n;
                }
                if (k == i){
                    break;
                }
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }
    public static void main(String[] args) {
        // Java Program to Left Rotate the Elements of an Array
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        // leftRotate1(arr,d); // first way
        //leftRotate2(arr,d); // second way
        leftRotate3(arr,d); // third way juggling algorithm
        for (Integer integer : arr){
            System.out.print(integer + " ");
        }
    }
}
