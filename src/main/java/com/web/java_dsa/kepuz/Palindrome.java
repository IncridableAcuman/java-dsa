package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str){
        str=str.toLowerCase();
        String s="";
        for (int i=str.length()-1;i>=0;i--){
            s=s+str.charAt(i);
        }
        return str.equals(s);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(isPalindrome(str) ? "True": "False");
    }
}
