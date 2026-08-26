package com.web.java_dsa.kepuz.basic;

import java.util.Scanner;

public class KeyingiBolinadiganSon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i=0;
        while (true){
            if (i%13==0 && i> n){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
