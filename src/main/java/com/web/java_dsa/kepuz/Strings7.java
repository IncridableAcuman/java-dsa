package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class Strings7 {
    public static void main(String[] args) {
        // https://kep.uz/problems/393
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String  t = "Python";
        int count=0;
        if (str.length()>=t.length()){
            for (int i=0;i<str.length()-t.length();i++){
                if (t.equals(str.substring(i,i + t.length()))){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
