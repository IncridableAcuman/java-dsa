package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class BinaryToDecimal {
    public static int toDecimal(String str){
        int decimal=0,power=0;
        for (int i=str.length()-1;i>=0;i--){
            char c = str.charAt(i);
            if (c == '1'){
                decimal+= (int) Math.pow(2,power);
            }
            power++;
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(toDecimal(str));
    }
}
