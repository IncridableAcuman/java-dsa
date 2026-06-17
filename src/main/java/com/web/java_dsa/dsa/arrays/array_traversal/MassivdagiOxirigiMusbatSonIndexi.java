package com.web.java_dsa.dsa.arrays.array_traversal;

import java.util.Scanner;

public class MassivdagiOxirigiMusbatSonIndexi {
    public static void main(String[] args) {
//        Massivdagi oxirgi musbat element indeksini toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int oxirgiMusbatSonIndexi = 0;
        for (int i=0;i<n;i++){
            if (arr[i] >= 0){
                oxirgiMusbatSonIndexi = i;
            }
        }
        System.out.println(oxirgiMusbatSonIndexi);
    }
}
