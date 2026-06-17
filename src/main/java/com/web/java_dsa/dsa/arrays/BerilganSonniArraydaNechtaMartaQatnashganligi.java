package com.web.java_dsa.dsa.arrays;

import java.util.Scanner;

public class BerilganSonniArraydaNechtaMartaQatnashganligi {
    public static void main(String[] args) {
//        Berilgan son massivda necha marta qatnashganini toping.
        Scanner scanner = new Scanner(System.in);
        System.out.print("N=");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print("x=");
        int x = scanner.nextInt();
        int count = 0;
        for (int i=0;i<n;i++){
            if (arr[i] == x){
                count++;
            }
        }
        System.out.println(count);
    }
}
