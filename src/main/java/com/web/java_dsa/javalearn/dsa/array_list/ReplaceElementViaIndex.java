package com.web.java_dsa.javalearn.dsa.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReplaceElementViaIndex {
    public static void main(String[] args) {
        // Index bo'yicha elementni o'zgartiring.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        /*for (int i = list.size() - 1; i >= 0; i--){
            list.set(list.size() - i - 1,list.get(i));
        }
        for (int x : list){
            System.out.print(x + " ");
        }*/
        Collections.reverse(list);
        for (int x : list){
            System.out.print(x + " ");
        }
    }
}
