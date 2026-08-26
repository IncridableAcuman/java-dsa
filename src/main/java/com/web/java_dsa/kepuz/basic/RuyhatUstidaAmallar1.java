package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class RuyhatUstidaAmallar1 {
    public static void main(String[] args) {
        // https://kep.uz/problems/1089
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int x=0,y=0;
        for (int i=0;i<n;i++){
            if (arr[i]%2==0){
                x++;
            }
            if (arr[i]%2==1){
                y++;
            }
        }
        System.out.println(x * y);
    }
}
