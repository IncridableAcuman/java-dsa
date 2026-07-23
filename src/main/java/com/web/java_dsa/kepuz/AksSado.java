package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class AksSado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
            if (i<str.length()){
                System.out.print(str.charAt(i));
            }
        }
    }
}
