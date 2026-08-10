package com.web.java_dsa.basic.dsa.list;

import java.util.*;

public class UnionElementInList {
    public static void main(String[] args) {
        // Union.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int x : list){
            map.put(x,map.getOrDefault(x,0) + 1);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                System.out.println(entry.getKey());
            }
        }
    }
}
