package com.web.java_dsa.dsa.arrays.array_traversal;

import java.util.Scanner;

public class MassivniEngKattaElementiIndexi {
    public static void main(String[] args) {
//        Massivdagi eng katta element indeksini toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int maxNumber=arr[0],index=0;
        for (int i=0;i<n;i++){
            if (arr[i] > maxNumber){
                maxNumber = arr[i];
                index = i;
            }
        }
//        index 0 dan boshlanadi
        System.out.println("Max number: " + maxNumber + "\n" + "Index: " + index);
    }
}
