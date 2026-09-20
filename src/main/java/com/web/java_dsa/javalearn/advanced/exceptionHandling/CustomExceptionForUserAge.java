package com.web.java_dsa.javalearn.advanced.exceptionHandling;

import java.util.Scanner;

public class CustomExceptionForUserAge {
    public static void main(String[] args) {
        // 44. Foydalanuvchidan yosh oling. Yosh manfiy bo‘lsa custom exception tashlang.
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            if (age < 0){
                throw new InvalidAgeException("Yoshingiz manfiy bo'lishi mumkin");
            }
            System.out.println("Your age is: " + age);
        } catch (InvalidAgeException exception){
            System.out.println(exception.getLocalizedMessage());
        }

    }
}
