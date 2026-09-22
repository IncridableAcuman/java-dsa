package com.web.java_dsa.javalearn.arrays;

import java.util.Scanner;

public class CountingPositiveNegativeAndZeros {
    public static void main(String[] args) {
        // Massivdagi musbat, manfiy va 0 elementlarni alohida sanang.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int positiveCounter=0,negativeCounter=0,zeroCounter=0;
        for (Integer integer : arr){
            if (integer > 0){
                positiveCounter++;
            } else if (integer < 0){
                negativeCounter++;
            } else {
                zeroCounter++;
            }
        }
        System.out.print("Positive numbers: " + positiveCounter + "\nNegative numbers: " + negativeCounter +
                "\nZeros: " + zeroCounter);
    }
}
