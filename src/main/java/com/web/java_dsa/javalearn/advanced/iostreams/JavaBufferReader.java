package com.web.java_dsa.javalearn.advanced.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JavaBufferReader {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("code.txt"))) {
            String line;
            while ((line=bufferedReader.readLine())!=null){
                System.out.print(line);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
