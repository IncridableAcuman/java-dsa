package com.web.java_dsa.kepuz.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UchtaSonniMedianasi {
    public static void main(String[] args) {
        // https://kep.uz/problems/459
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        Collections.sort(list);
        System.out.println(list.get(1));
    }
}
