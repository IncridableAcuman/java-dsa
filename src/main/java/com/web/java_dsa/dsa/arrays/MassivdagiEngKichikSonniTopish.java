package com.web.java_dsa.dsa.arrays;

import java.util.Scanner;

public class MassivdagiEngKichikSonniTopish {
    public static void main(String[] args) {
//        Massivdagi eng kichik elementni toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int minNumber = 0;
        for (int i=0;i<n;i++){
            if (minNumber > arr[i]){
                minNumber = arr[i];
            }
        }
        System.out.println(minNumber);
    }
}
