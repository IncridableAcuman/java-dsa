package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class NumberOfTrailingZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       int count = 0;
      String str = String.valueOf(n);
        for (int i=0;i<str.length();i++){
            if (str.charAt(str.length() - i - 1) == 48){
               count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
