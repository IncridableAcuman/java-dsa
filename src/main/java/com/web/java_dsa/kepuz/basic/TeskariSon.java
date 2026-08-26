package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class TeskariSon {
    public static void main(String[] args) {
        // https://kep.uz/problems/334
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if (c == '6'){
                sb.append("9");
            } else if (c == '9') {
                sb.append("6");
            }
        }
        System.out.println(sb);
    }
}
