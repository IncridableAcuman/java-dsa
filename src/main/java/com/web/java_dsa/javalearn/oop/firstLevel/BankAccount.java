package com.web.java_dsa.javalearn.oop.firstLevel;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber,String ownerName,double balance){
        this.accountNumber=accountNumber;
        this.ownerName=ownerName;
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }
    public void deposit(double deposit){
        balance += deposit;
    }
    public void withDraw(double amount){
        balance -= amount;
    }
    @Override
    public String toString(){
        return "Account number: " + accountNumber + " Owner name: " + ownerName + " Total balance: " + balance;
    }

    public static void main(String[] args) {
        // 1. Bank Account
        //
        //BankAccount klassini yarating.
        //
        //accountNumber
        //ownerName
        //balance
        //
        //Metodlar:
        //
        //deposit()
        //withdraw()
        //getBalance()
        //
        //Talab: balansni tashqaridan to‘g‘ridan-to‘g‘ri o‘zgartirib bo‘lmasin.
    }
}
