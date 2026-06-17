package com.web.java_dsa.dsa.arrays.array_traversal;

import java.util.Scanner;

public class MassivniEngKichikElementiIndexi {
    public static void main(String[] args) {
//        Massivdagi eng kichik element indeksini toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int minNumber=arr[0],index=0;
        for (int i=0;i<n;i++){
            if (arr[i]<minNumber){
                minNumber=arr[i];
                index=i;
            }
        }
        System.out.println("Min element: " + minNumber + "\n" + "Index: " + index);
    }
}
