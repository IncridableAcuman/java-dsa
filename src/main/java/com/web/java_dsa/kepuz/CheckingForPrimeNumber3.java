package com.web.java_dsa.kepuz;

import java.math.BigInteger;
import java.util.Scanner;

public class CheckingForPrimeNumber3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextBigInteger()){
            BigInteger n = scanner.nextBigInteger();
            boolean isPrime = n.isProbablePrime(100);

            System.out.println(isPrime ? "Yes":"No");
        }
    }
}
