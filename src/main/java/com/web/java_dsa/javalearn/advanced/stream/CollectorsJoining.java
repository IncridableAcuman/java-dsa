package com.web.java_dsa.javalearn.advanced.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CollectorsJoining {
    public static void main(String[] args) {
        // 16. Collectors.joining()
        //List<String> names =
        //        List.of("Ali", "Vali", "Sardor", "Izzatbek");
        //
        //Barcha nomlarni bitta String'ga birlashtiring:
        //
        //Ali, Vali, Sardor, Izzatbek
        //
        //Collectors.joining(", ") ishlating.
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
                .collect(Collectors.joining(", "));

        System.out.println(joining);
    }
}
