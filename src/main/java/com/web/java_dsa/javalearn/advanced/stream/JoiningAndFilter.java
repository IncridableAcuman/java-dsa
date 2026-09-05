package com.web.java_dsa.javalearn.advanced.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JoiningAndFilter {
    public static void main(String[] args) {
        // 17. joining() + filter
        //List<String> names =
        //        List.of(
        //            "Ali",
        //            "Izzatbek",
        //            "Bob",
        //            "Sardor",
        //            "Akmal"
        //        );
        //
        //Uzunligi 4 dan katta bo‘lgan nomlarni:
        //
        //Izzatbek, Sardor, Akmal
        //
        //ko‘rinishida bitta String'ga birlashtiring.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n=scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            System.out.print(i + "-name=");
            String name = scanner.next();
            list.add(name);
        }
        String joining = list
                .stream()
                .filter(s -> s.length() > 4)
                .collect(Collectors.joining(", "));
        System.out.println(joining);
    }
}
