package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintStringOfLengthGreaterThan5 {
    public static void main(String[] args) {
        // 24. Faqat uzunligi 5 dan katta String'lar
        //["Java", "Spring", "Docker", "Git", "PostgreSQL", "SQL"]
        //
        //Natija:
        //
        //Spring
        //Docker
        //PostgreSQL
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            System.out.print(i + "-element=");
            String element = scanner.next();
            list.add(element);
        }
        list
                .stream()
                .filter(x-> x.length() > 5)
                .forEach(x-> System.out.print(x + " "));
    }
}
