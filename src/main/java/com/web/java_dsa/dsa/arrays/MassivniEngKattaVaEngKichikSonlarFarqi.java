package com.web.java_dsa.dsa.arrays;

import java.util.Scanner;

public class MassivniEngKattaVaEngKichikSonlarFarqi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int minNumber = arr[0],maxNumber = arr[0];
        for (int i=0;i<n;i++){
            if (arr[i] > maxNumber){
                maxNumber = arr[i];
            }
            if (arr[i]<minNumber){
                minNumber = arr[i];
            }
        }
        System.out.println("Farqi: " + (maxNumber - minNumber));
    }
}
