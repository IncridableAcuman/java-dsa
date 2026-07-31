package com.web.java_dsa.kepuz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MassivUstidaAmallar1 {
    public static void main(String[] args) {
        // https://kep.uz/problems/625
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            int k=scanner.nextInt();
            list.add(k);
        }
        list.remove(list.size()-1);
        list.remove(list.get(0));
        for (Integer integer:list){
            System.out.print(integer+" ");
        }
    }
}
