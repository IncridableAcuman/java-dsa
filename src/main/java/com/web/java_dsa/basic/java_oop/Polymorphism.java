package com.web.java_dsa.basic.java_oop;

public class Polymorphism {
    public void printInfo(){
        System.out.println("Print your name");
    }
    public Polymorphism(){
        System.out.println("Parent class");
    }
}
/*
public class Izzatbek extends Polymorphism{
    public volatile printInfo(){
        System.out.println("My name is Izzatbek");
    }
}
public class Root {
    public static void main(String[] args) {

        Izzatbek izzatbek = new Izzatbek();
        izzatbek.printInfo();
    }
}*/