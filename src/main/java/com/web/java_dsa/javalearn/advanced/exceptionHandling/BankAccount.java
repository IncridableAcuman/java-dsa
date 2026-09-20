package com.web.java_dsa.javalearn.advanced.exceptionHandling;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        // 45. InsufficientBalanceException yarating.
        //
        //Bank hisobidan balansdan ko‘p pul yechilsa exception tashlansin.
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Pul miqdorini kiriting: ");
            double balance = scanner.nextDouble();
            double totalBalance = 20000.54;
            if (balance > totalBalance){
                throw new InsufficientBalanceException("Hisobingizda balance yetarli emas");
            }
            totalBalance -= balance;
            System.out.println("Pul yechildi: " + balance);
            System.out.println("Jami hisobingizda " + totalBalance + " qoldi.");
        } catch (InsufficientBalanceException exception){
            System.out.println(exception.getMessage());
        }
    }
}
