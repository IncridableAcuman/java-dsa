package com.web.java_dsa.javalearn.dsa.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListdagiMusbatSonlarniAjratish {
    public static void main(String[] args) {
        // List ichidan faqat musbat sonlarni ajrating.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> elements = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int element = scanner.nextInt();
            elements.add(element);
        }
        List<Integer> musbatElementlar = new ArrayList<>();
        for (int element : elements){
            if (element >= 0){
                musbatElementlar.add(element);
            }
        }
        for (int element : musbatElementlar){
            System.out.print(element + " ");
        }
    }
}
