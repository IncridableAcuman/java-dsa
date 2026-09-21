package com.web.java_dsa.javalearn.arrays;

import java.util.Scanner;

public class RightRotateTheElementsOfAnArray {
    public static void rightRotate1(int[] arr,int d){
        int n = arr.length;
        for (int j = 0; j < d; j++){
            int last = arr[n-1];
            for (int i = n - 1; i > 0; i--){
                arr[i] = arr[i-1];
            }
            arr[0]=last;
        }
    }
    public static void rightRotate2(int[] arr, int d){
        int n = arr.length;
        d = d % n;
        int[] temp = new int[n];

        for (int i=0;i<d;i++){
            temp[i] = arr[n - d + i];
        }
        for (int i=0;i<n-d;i++){
            temp[d + i] = arr[i];
        }
        for (int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
    public static int gcd(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void rightRotate3(int[] arr, int d){
        int n = arr.length;
        d = d % n;

        int g = gcd(n,d);

        for (int i=0;i<g;i++){
            int currentIndex = i;
            int currentElement = arr[currentIndex];

            do {
                int nextIndex = (currentIndex + d) % n;
                int nextElement = arr[nextIndex];

                arr[nextIndex]=currentElement;

                currentElement = nextElement;

                currentIndex = nextIndex;

            } while (currentIndex != i);
        }
    }
    public static void reverseArray(int[] arr,int start,int end){
        while (start < end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void rightRotate4(int[] arr,int d){
        int n = arr.length;
        d = d % n;

        reverseArray(arr,0,n - 1);

        reverseArray(arr,0,d - 1);

        reverseArray(arr,d,n - 1);
    }
    public static void main(String[] args) {
        //         // Java Program to Right Rotate the Elements of an Array
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        //rightRotate1(arr,d); // first way: Time Complexity: O(n * d), Auxiliary Space: O(1)
        //rightRotate2(arr,d); // second way: Time complexity: O(n), where n is the size of input array arr[], Auxiliary Space: O(n
        //rightRotate3(arr,d); // third way: Juggling Algorithm.
        rightRotate4(arr,d); // third way: Time Complexity: O(n), Auxiliary Space: O(1)
        for (Integer integer : arr){
            System.out.print(integer + " ");
        }
    }
}
