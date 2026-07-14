package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class BeshtaNol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = String.valueOf(n);
        int count=0;
        for (int i=str.length()-1;i>=0;i--){
            if (str.charAt(i)==48){
                count++;
            } else {
                break;
            }
            if (count==5){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
