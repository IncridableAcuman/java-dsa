package com.web.java_dsa.dsa.arrays.sliding_window;

import java.util.Scanner;
//         K ta nolni bitta qilish mumkin bo‘lsa eng uzun 1 lar ketma-ketligini toping.
public class EngUzunBirlarKetmaKetligi {
    public static int longestOneLength(String str){
        int best=0;
        int run=0;
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if (Character.isDigit(c) && c==49){
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
        int res = longestOneLength(str);
        System.out.println(res);
    }
}
