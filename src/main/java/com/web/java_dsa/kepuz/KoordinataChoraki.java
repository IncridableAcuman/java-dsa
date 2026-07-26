package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class KoordinataChoraki {
    public static void main(String[] args) {
        // https://kep.uz/problems/92
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x>0 && y>0){
            System.out.println(1);
        } else if (x<0 && y>0) {
            System.out.println(2);
        } else if (x<0 && y<0) {
            System.out.println(3);
        } else if (x>0 && y<0) {
            System.out.println(4);
        }
    }
}
