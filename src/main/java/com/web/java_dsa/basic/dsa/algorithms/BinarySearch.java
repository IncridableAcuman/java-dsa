package com.web.java_dsa.basic.dsa.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr,int l,int r,int x){
        while (l<=r){
            int m = (l+r)/2;
            
            if (arr[m]==x){
                return m;
            } else if (arr[m]>x) {
                r = m-1;
            } else {
                l = m+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //     Binary Search.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] arr = new int[n];
        //List<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++){
           // int k = scanner.nextInt();
           // list.add(k);
            arr[i] = scanner.nextInt();
        }
       /* Collections.sort(list);
        System.out.println(Collections.binarySearch(list,x));*/
        int res = binarySearch(arr,x,0,n);
        System.out.println(res);
        scanner.close();
    }
}
