package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveIf {
    public static void main(String[] args) {
        // 19. removeIf()
        //
        //List:
        //
        //List<Integer> numbers =
        //    new ArrayList<>(List.of(3, 8, 12, 15, 21, 30, 41));
        //
        //Lambda yordamida 10 dan kichik sonlarni o‘chiring.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list length: ");
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            int k = scanner.nextInt();
            list.add(k);
        }
        list
                .removeIf((x)-> x < 10);

        for (Integer x : list){
            System.out.print(x + " ");
        }
    }
}
