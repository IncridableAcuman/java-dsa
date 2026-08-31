package com.web.java_dsa.kepuz.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JuftToplam {
    public static void main(String[] args) {
        // https://kep.uz/problems/623
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        int x=0,y=0;
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                x++;
            } else {
                y++;
            }
        }
        System.out.println(x==y ? "Yes" : "No");
    }
}
