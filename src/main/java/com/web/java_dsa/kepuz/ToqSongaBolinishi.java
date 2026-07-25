package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class ToqSongaBolinishi {
    // https://kep.uz/problems/125
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int count=0;
        for (int i=1;i<=a;i+=2){
            if (a%i==0 && i!=1){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
