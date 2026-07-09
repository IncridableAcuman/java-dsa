package com.web.java_dsa.oop;

public class ClassAttributes {
    int x = 5;
    int y = 10;
    int z;
    int a = 20;
    final double PI = 3.14;
    public static void main(String[] args) {
        ClassAttributes attributes = new ClassAttributes();
        System.out.println(attributes.x); // 5
        System.out.println(attributes.y); // 10
        attributes.z=15; // 15
        System.out.println(attributes.z); // 15
        // override
        attributes.a=25;
        System.out.println(attributes.a); // 25 not 20
       // attributes.PI=3.15; // Cannot assign a value to final variable 'PI'
        System.out.println(attributes.PI);
    }
}
