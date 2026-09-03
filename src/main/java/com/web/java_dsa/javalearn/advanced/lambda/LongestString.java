package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.*;

public class LongestString {
    public static void main(String[] args) {
        // 18. Eng uzun String'ni topish
        //["Java", "Spring", "Hibernate", "Docker"]
        //
        //ichidan eng uzun String'ni lambda yordamida toping.
        //
        //Output:
        //Hibernate
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list length: ");
        int n = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            System.out.print(i+ " - element: ");
            String k = scanner.next();
            list.add(k);
        }
        Optional<String> longestStr = list
                .stream()
                .max(Comparator.comparing(String::length));
        System.out.println(longestStr.get());
    }
}
