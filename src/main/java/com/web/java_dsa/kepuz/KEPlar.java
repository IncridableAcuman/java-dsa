package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class KEPlar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String x = "kep";
        int count=0;
        for (int i=0;i+x.length()<=str.length();i++){
            if (str.startsWith(x, i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
