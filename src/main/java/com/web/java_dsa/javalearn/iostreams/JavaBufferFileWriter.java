package com.web.java_dsa.javalearn.iostreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class JavaBufferFileWriter {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("code.txt"))) {
            bufferedWriter.write("Java");
            bufferedWriter.newLine();
            bufferedWriter.write("Spring Boot");
            bufferedWriter.newLine();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
