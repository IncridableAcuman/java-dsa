package com.web.java_dsa.javalearn.dsa.linked_list;

import java.util.LinkedList;
import java.util.Scanner;

public class FindMiddleElement {
    public static void main(String[] args) {
        // Middle elementni toping.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i=1;i<=n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        System.out.println( list.size() % 2 == 1 ? ( list.get( list.size() / 2 ) ) : ( list.get( list.size() / 2 - 1) ) );
    }
}
