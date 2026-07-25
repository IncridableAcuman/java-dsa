package com.web.java_dsa.kepuz;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class HozirgiSana {
    public static void main(String[] args) {
        // https://kep.uz/problems/148
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String str = date.format(formatter);
        System.out.println(str);
    }
}
