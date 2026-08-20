package com.web.java_dsa.javalearn.iostreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ismingizni kiriting: ");
        String ism = scanner.next();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("code.txt"))) {
            writer.write("Ismingiz: " + ism);
            writer.newLine();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
