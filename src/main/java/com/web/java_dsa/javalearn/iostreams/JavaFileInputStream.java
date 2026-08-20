package com.web.java_dsa.javalearn.iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaFileInputStream {
    /*public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("text.txt")) {
            int i;
            while ((i=input.read()) !=-1){
                System.out.print((char) i);
            }
        } catch (IOException e){
            System.out.print(e.getMessage());
            e.printStackTrace();
        }
    }*/
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("text.txt")) {
            FileOutputStream output = new FileOutputStream("code.txt");
            int i;
            while ((i=input.read())!=-1){
                output.write(i);
            }
            System.out.println("File copied successfully");
        } catch (IOException e){
            System.out.print(e.getMessage());
            e.printStackTrace();
        }
    }
}
