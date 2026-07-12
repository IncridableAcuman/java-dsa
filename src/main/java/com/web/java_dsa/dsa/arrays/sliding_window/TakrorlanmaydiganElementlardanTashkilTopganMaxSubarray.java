package com.web.java_dsa.dsa.arrays.sliding_window;

import java.util.Scanner;

public class TakrorlanmaydiganElementlardanTashkilTopganMaxSubarray {
    public static String maxSubarray(String str){
        int run=0;
        int best=0;
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<str.length()-1;i++){
            char c = str.charAt(i);
            if (str.charAt(i)!=str.charAt(i+1) && i<=str.length()-1){
                run++;
                if (run>best){
                    best=run;
                    builder.append(c);
                }
            } else {
                run=0;
            }
        }
        return builder.toString();
    }
    public static void main(String[] args) {
        //  Takrorlanmaydigan elementlardan tashkil topgan eng uzun subarrayni toping.
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String res = maxSubarray(str);
        System.out.println(res);
    }
}
