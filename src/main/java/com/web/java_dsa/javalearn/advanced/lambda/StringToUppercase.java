package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.Scanner;

interface Uppercase {
    String toUppercase(String str);
}

public class StringToUppercase {
    public static void main(String[] args) {
        // 7. String'ni katta harflarga o'tkazish
        //
        //String qabul qilib, UPPERCASE ko‘rinishida qaytaruvchi lambda yozing.

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Uppercase uppercase = String::toUpperCase;
        System.out.println(uppercase.toUppercase(str));
    }
}
