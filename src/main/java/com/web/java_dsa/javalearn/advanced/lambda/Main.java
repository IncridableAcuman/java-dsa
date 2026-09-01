package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.Scanner;

@FunctionalInterface
interface Calculator{
    int calculate(int a,int b);
  //  int sumDigit(int n); // Multiple non-overriding abstract methods found in Calculator
}
/*
// first way
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Calculator calculator = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a+b;
            }
        };
        System.out.println(calculator.calculate(a,b));
    }
}
*/
/*
// second way with lambda
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Calculator calculator = (x,y)->x+y;
        System.out.println(calculator.calculate(a,b));
    }
}*/
// third way
public class Main {
    public static void calculate(int a,int b,Calculator calculator){
        System.out.println(
                calculator.calculate(a,b)
        );
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
       // calculate(a,b,(a,b)->a+b); // Variable 'a' is already defined in the scope // Variable 'b' is already defined in the scope
        calculate(a,b,(x,y)->x+y);
    }
}