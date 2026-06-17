package com.web.java_dsa.dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MassivdagiToqSonlarSoni {
    public static void main(String[] args) {
//        Massivdagi toq sonlar sonini aniqlang.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i=0;i<n;i++){
            if (arr[i]%2 == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}
