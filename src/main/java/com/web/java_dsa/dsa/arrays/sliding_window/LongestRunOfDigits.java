package com.web.java_dsa.dsa.arrays.sliding_window;

import java.util.Scanner;

public class LongestRunOfDigits {
    public static int longestRunOfDigits(String text){
        int best = 0;
        int run = 0;
        for (int i=0;i<text.length();i++){
            int c = text.charAt(i);
            if (Character.isDigit(c)){
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
        String text = scanner.nextLine();
        int res = longestRunOfDigits(text);
        System.out.println(res);
    }
}
