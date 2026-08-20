package com.web.java_dsa.javalearn.dsa.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListDivisionToTwoArray {
    public static void main(String[] args) {
        // List ni ikkiga bo'ling.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> elements = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int element = scanner.nextInt();
            elements.add(element);
        }
        for (int i=0;i<elements.size()/2;i++){
            first.add(elements.get(i));
        }
        for (int i=elements.size()/2;i<elements.size();i++){
            second.add(elements.get(i));
        }
        for (int x : first){
            System.out.print(x + " ");
        }
        System.out.println();
        for (int y : second){
            System.out.print(y + " ");
        }
    }
}
