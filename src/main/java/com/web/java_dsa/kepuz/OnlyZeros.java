package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class OnlyZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='0'){
                count++;
            }
        }
        System.out.println(str.length()==count ? "Yes":"No");
    }
}
