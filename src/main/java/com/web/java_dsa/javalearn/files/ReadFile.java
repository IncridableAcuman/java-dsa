package com.web.java_dsa.javalearn.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("text.txt");
        try(Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()){
                String txt = scanner.nextLine();
                System.out.println(txt);
            }
        } catch (FileNotFoundException e ){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
