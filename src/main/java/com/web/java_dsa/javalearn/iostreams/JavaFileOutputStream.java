package com.web.java_dsa.javalearn.iostreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class JavaFileOutputStream {
    public static void main(String[] args) {
        String text = "Java Developer";
        try (FileOutputStream output = new FileOutputStream("code.txt")) {
            output.write(text.getBytes());
            System.out.println("Successfully wrote to the file");
        } catch (IOException e){
            System.out.print(e.getMessage());
            e.printStackTrace();
        }
    }
}
