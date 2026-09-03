package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortingListElementViaStringElementOfLength {
    public static void main(String[] args) {
        // 15. List'dagi String'larni uzunligiga qarab saralash
        //List<String> names =
        //    List.of("Ali", "Izzatbek", "Bob", "Sardor", "Akmal");
        //
        //Lambda yordamida String'larni uzunligiga qarab o‘sish tartibida sort qiling.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list length: ");
        int n = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            String k = scanner.next();
            list.add(k);
        }
      /*  //first way
        List<String> sorted = list
                .stream()
                .sorted((s1,s2)->Integer.compare(s1.length(),s2.length()))
                .toList();
        System.out.println(sorted);*/

        // second way
        List<String> sortedList = list
                .stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();
        System.out.println(sortedList);
    }
}
