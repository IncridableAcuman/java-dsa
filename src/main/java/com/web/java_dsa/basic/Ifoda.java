package com.web.java_dsa.basic;

import java.util.Scanner;

public class Ifoda {
    public static void main(String[] args) {
        /*9. X,Y haqiqiy sonlari berilgan. Quyidagi ifodani hisoblash dastursi tuzilsin.*/

        Scanner scanner = new Scanner(System.in);

        double X = scanner.nextDouble();
        double Y = scanner.nextDouble();

        double result = (Math.abs(X) - Math.abs(Y)) / (1 + Math.abs(X*Y));

        System.out.println(result);
    }
}
