package com.web.java_dsa.kepuz;

import java.util.Arrays;
import java.util.Scanner;

public class SortingFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        for (Integer integer:arr){
            System.out.print(integer+" ");
        }
    }
}
