package com.web.java_dsa.kepuz;

import java.util.Scanner;

public class FirstOneSecondTwoThreeElementIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x=0,y=0,z=0;
        int a=-1,b=-1,c=-1;
        for (int i=1;i<=n;i++){
            int target = scanner.nextInt();
            if (target==1){
                x++;
                if (x==1) a=i;
            } else if (target==2) {
                y++;
                if (y==2) b=i;
            } else if (target==3) {
                z++;
                if (z==3) c=i;
            }
        }
        if (a != -1 && b != -1 && c != -1) {
            System.out.println(a + " " + b + " " + c);
        } else {
            System.out.println(-1);
        }
    }
}
