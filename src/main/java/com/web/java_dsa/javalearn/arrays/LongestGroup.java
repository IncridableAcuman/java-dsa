package com.web.java_dsa.javalearn.arrays;

import java.util.Scanner;

public class LongestGroup {
    public static void main(String[] args) {
        // Massivdagi eng uzun ketma-ket bir xil elementlar guruhini toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int currentLength = 1;
        int maxLength = 1;
        int longestRepeatElement = arr[0];
        for (int i=1;i<n;i++){
            if (arr[i] == arr[i-1]){
                currentLength++;
            } else {
                currentLength=1;
            }
            if (currentLength > maxLength){
                maxLength = currentLength;
                longestRepeatElement = arr[i];
            }
        }
        System.out.println("Longest repeat element: " + longestRepeatElement);
    }
}
