package com.web.java_dsa.dsa.arrays;

import java.util.Scanner;

public class MassivdagiKattaSonniTopish {
//    Massivdagi eng katta elementni toping.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int maxNumber = 0;
        for (int i=0;i<n;i++){
            if (arr[i] > maxNumber){
                maxNumber = arr[i];
            }
        }
        System.out.println(maxNumber);
    }
}
