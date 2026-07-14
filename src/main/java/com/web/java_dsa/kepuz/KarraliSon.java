package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class KarraliSon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int i=0;
        while (true){
            if (i>n && i%n==0){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
