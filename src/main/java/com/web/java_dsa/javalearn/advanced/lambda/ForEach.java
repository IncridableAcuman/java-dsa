package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        // 20. forEach()
        //
        //Quyidagi List:
        //
        //List<String> names =
        //    List.of("Ali", "Vali", "Sardor", "Izzatbek");
        //
        //Lambda yordamida har bir elementni quyidagicha chiqaring:
        //
        //Name: Ali
        //Name: Vali
        //Name: Sardor
        //Name: Izzatbek
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        List<String> names = new ArrayList<>();
        for (int i=1;i<=n;i++){
            System.out.print(i + "-name= ");
            String name = scanner.next();
            names.add(name);
        }
        Consumer<String> consumer = (name) -> System.out.println("Name: " + name);
        for (String name : names){
            consumer.accept(name);
        }
    }
}
