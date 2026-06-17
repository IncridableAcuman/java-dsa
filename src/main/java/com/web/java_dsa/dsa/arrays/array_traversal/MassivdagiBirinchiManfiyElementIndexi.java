package com.web.java_dsa.dsa.arrays.array_traversal;

import java.util.Scanner;

public class MassivdagiBirinchiManfiyElementIndexi {
    public static void main(String[] args) {
//        Massivdagi birinchi manfiy element indeksini toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int index = 0;
        for (int i=0;i<n;i++){
            if (arr[i] <0){
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
}
