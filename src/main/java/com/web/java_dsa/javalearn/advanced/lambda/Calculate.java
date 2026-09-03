package com.web.java_dsa.javalearn.advanced.lambda;


import java.util.Scanner;

public class Calculate {
    // 9. Calculator interface
    //
    //Quyidagi interface'ni yarating:

    // Lambda yordamida:
    //
    //qo‘shish
    //ayirish
    //ko‘paytirish
    //bo‘lish
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Calculator sum = Integer::sum;
        System.out.println(sum.calculate(a,b));
        Calculator division = (x,y)-> x > y ? x / y : y / x;
        System.out.println(division.calculate(a,b));
        Calculator multiple = (x,y)-> x * y;
        System.out.println(multiple.calculate(a,b));
        Calculator subtraction = (x,y)-> x > y ? x - y : y - x;
        System.out.println(subtraction.calculate(a,b));
    }
}
