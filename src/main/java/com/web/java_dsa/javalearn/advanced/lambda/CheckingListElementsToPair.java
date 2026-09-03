package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class CheckingListElementsToPair {
    public static void main(String[] args) {
        // 14. List'dagi sonlarni tekshirish
        //
        //Berilgan:
        //
        //List<Integer> numbers =
        //    List.of(2, 7, 10, 15, 20, 25, 30);
        //
        //Lambda yordamida faqat juft sonlarni aniqlang.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter List length: ");
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        Predicate<Integer> predicate = (x)-> x % 2 == 0;
        for (Integer integer : list){
            if (predicate.test(integer)){
                System.out.print(integer + " ");
            }
        }
    }
}
