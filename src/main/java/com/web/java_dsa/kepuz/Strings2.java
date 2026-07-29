package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class Strings2 {
    public static void main(String[] args) {
        // https://kep.uz/problems/388
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i=0;i<str.length();i++){
            if (i%2==0){
                System.out.print(str.charAt(i));
            }
        }
    }
}
