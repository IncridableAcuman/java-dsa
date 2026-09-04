package com.web.java_dsa.javalearn.advanced.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Limit {
    public static void main(String[] args) {
        // 11. limit()
        //List<Integer> numbers =
        //        List.of(10, 20, 30, 40, 50, 60, 70);
        //
        //Faqat dastlabki 3 ta elementni oling.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        list
                .stream()
                .limit(3)
                .forEach(x-> System.out.print(x + " "));
    }
}
