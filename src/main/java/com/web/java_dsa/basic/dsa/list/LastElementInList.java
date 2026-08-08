package com.web.java_dsa.basic.dsa.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LastElementInList {
    public static void main(String[] args) {
        // Oxirgi elementni chiqaring.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        System.out.println("Last element in list: " + list.get(list.size() - 1));
    }
}
/*
* 5
5 6 7 8 9
Last element in list: 9
* */