package com.web.java_dsa.oop;

public class JavaPolymorphism {


    public int add(int x,int y){
        return x+y;
    }
    public int add(int x,int y,int z){
        return x+y+z;
    }
    public String add(String a,String b){
        return a+b;
    }

    public static void main(String[] args) {
        JavaPolymorphism polymorphism = new JavaPolymorphism();
        System.out.println(polymorphism.add(4,5));
        System.out.println(polymorphism.add(1,2,3));
        System.out.println(polymorphism.add("Love","Coding"));
        // Bir xil nomdagi methodlarni parametrlar soni va turi bilan farq qilib,turli xil vazifalarni bajaraish jarayoniga polimorfizm deyiladi
    }
}
