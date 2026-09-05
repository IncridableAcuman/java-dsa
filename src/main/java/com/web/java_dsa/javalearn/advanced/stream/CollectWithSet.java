package com.web.java_dsa.javalearn.advanced.stream;

import java.util.*;
import java.util.stream.Collectors;

public class CollectWithSet {
    public static void main(String[] args) {
        // 15. collect(Collectors.toSet())
        //List<String> names =
        //        List.of(
        //            "Ali",
        //            "Vali",
        //            "Ali",
        //            "Sardor",
        //            "Vali",
        //            "Izzatbek"
        //        );
        //
        //Takroriy nomlarni olib tashlab, Set hosil qiling.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n=scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            System.out.print(i + "-name=");
            String name = scanner.next();
            list.add(name);
        }

        java.util.Set<String> set = list
                .stream()
                .collect(Collectors.toSet());
        for (String st:set){
            System.out.print(st + " ");
        }
    }
}
