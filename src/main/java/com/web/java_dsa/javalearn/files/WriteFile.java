package com.web.java_dsa.javalearn.files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
       /* try {
            FileWriter writer = new FileWriter("text.txt");
            writer.write("Hi Java developer");
            writer.write("Java Spring Boot");
            writer.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }*/
        try(FileWriter writer = new FileWriter("text.txt")) {
            writer.write("Docker");
            writer.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
