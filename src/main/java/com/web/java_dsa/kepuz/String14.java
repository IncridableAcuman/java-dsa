package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class String14 {
    public static void main(String[] args) {
        // https://kep.uz/problems/400
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString().equals(str) ? "Yes" : "No");
    }
}
