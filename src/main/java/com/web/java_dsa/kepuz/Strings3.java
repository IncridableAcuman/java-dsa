package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class Strings3 {
    public static void main(String[] args) {
        // https://kep.uz/problems/389
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<str.length();i++){
            if (i%2==0){
                sb.append(str.charAt(i));
            }
        }
        for (int i=sb.length()-1;i>=0;i--){
            System.out.print(sb.charAt(i));
        }
    }
}
