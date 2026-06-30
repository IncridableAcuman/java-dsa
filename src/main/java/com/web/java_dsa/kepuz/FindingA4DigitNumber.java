package com.web.java_dsa.kepuz;

public class FindingA4DigitNumber {
    public static int reverseNumber(int n) {
        String sum = "";
        while (n != 0) {
            int r = n % 10;
            sum += r;
            n /= 10;
        }
        return Integer.parseInt(sum);
    }
        public static void main (String[]args){
            int start = 1000;
            int end = 9999;
            for (int i = start;i<=end;i++){
                if ((i*4) == reverseNumber(i)){
                    System.out.println(i);
                }
            }
        }
}