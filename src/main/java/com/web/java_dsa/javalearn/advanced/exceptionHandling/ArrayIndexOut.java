package com.web.java_dsa.javalearn.advanced.exceptionHandling;

import java.util.Scanner;

public class ArrayIndexOut {
    public static void main(String[] args) {
        // 42. Array index xatosini ushlang.
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Index=");
            int arrayIndex = scanner.nextByte();
            int[] nums = {1,2,3,4,5};
            System.out.println(nums[arrayIndex]);
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception.getLocalizedMessage());
        }
    }
}
