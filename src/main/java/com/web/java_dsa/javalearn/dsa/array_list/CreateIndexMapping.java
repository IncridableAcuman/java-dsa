package com.web.java_dsa.javalearn.dsa.array_list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CreateIndexMapping {
    public static void main(String[] args) {
        // Index mapping yarating.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            int k=scanner.nextInt();
            list.add(k);
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i< list.size();i++){
            map.put(list.get(i), i);
        }
        System.out.println(map);

        System.out.println(map.get(x));
    }
}
