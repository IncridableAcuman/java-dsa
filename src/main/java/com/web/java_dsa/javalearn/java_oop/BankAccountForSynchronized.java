package com.web.java_dsa.javalearn.java_oop;

public class BankAccountForSynchronized {
    private int balance = 100;

    public synchronized void withdraw(String name,int amount){
        System.out.println(name + " pul yechishni boshladi. Balance tekshirilmoqda...");
        if (balance >= amount){
            System.out.println(name + " uchun balance yetarli. Pul sanalmoqda...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(name + " " + amount + "$ yechdi. Qolgan blaance: " + balance + "$\n");
        } else {
            System.out.println(name + " uchun balance yetarli emas! Qolgan balance: " + balance + "$\n");
        }
    }

    public static void main(String[] args) {
        BankAccountForSynchronized account = new BankAccountForSynchronized();
        Thread husband = new Thread(()->account.withdraw("husband",80));
        Thread wife = new Thread(()->account.withdraw("wife",80));

        husband.start();
        wife.start();
    }
}
