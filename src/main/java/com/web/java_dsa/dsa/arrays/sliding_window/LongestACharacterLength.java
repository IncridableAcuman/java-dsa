package com.web.java_dsa.dsa.arrays.sliding_window;

import java.util.Scanner;

public class LongestACharacterLength {
    public static int longestACharacterLength(String str){
        int best=0;
        int run=0;
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if (Character.isAlphabetic(c) && (c=='a' || c=='A')){
                run++;
                if (run>best){
                    best=run;
                }
            } else {
                run=0;
            }
        }
        return best;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int res = longestACharacterLength(str);
        System.out.println(res);
    }
}
