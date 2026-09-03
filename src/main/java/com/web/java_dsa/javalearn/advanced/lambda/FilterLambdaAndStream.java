package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterLambdaAndStream {
    public static void main(String[] args) {
        // Bu bosqichda Lambda + Stream API kombinatsiyasiga o'ting.
        //
        //21. Filter
        //List<Integer> numbers =
        //    List.of(3, 8, 12, 15, 21, 30, 41, 50);
        //
        //Lambda va Stream yordamida faqat:
        //
        //juft
        //20 dan katta
        //
        //sonlarni oling.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int number = scanner.nextInt();
            numbers.add(number);
        }
        List<Integer> filteredList =  numbers
                .stream()
                .filter((x)-> x % 2 == 0 && x > 20).toList();
        for (Integer integer : filteredList){
            System.out.print(integer + " ");
        }
    }
}
