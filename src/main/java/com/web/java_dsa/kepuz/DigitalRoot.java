package com.web.java_dsa.kepuz;

import java.math.BigInteger;
import java.util.Scanner;

public class DigitalRoot {
    public static BigInteger digitalRoot(BigInteger n){
        if (n.equals(BigInteger.ZERO)){
            return BigInteger.ZERO;
        }
        BigInteger integer = n.mod(BigInteger.valueOf(9));

        return integer.equals(BigInteger.ZERO) ? BigInteger.valueOf(9) : integer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = new BigInteger(scanner.next());
        BigInteger res = digitalRoot(n);
        System.out.println(res);
    }
}
