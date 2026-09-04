package com.web.java_dsa.javalearn.advanced.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pagination {
    public static void main(String[] args) {
        // 13. Pagination
        //
        //Bu real backend'ga yaqin masala.
        //
        //List<Integer> products =
        //        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
        //                11, 12, 13, 14, 15);
        //
        //page = 2, pageSize = 5 bo‘lganda qaysi productlar chiqishini skip() va limit() yordamida toping.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            System.out.print(i + "-element=");
            int k = scanner.nextInt();
            list.add(k);
        }
        System.out.print("page=");
        int page = scanner.nextInt();
        System.out.print("pageSize=");
        int pageSize = scanner.nextInt();

        int skippValue = ( page - 1 ) * pageSize;
        list
                .stream()
                .skip(skippValue)
                .limit(pageSize)
                .forEach(x-> System.out.print(x + " "));

        // n=15
        //Input: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        //Output: 6 7 8 9 10
    }
}
