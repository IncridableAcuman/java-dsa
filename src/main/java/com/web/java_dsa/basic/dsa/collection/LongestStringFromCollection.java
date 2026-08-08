package com.web.java_dsa.basic.dsa.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class LongestStringFromCollection {
    public static String findLongestStringFromArray(Collection<String> collection){
        String maxStr = "";
        for (String word : collection){
            if (word.length() > maxStr.length()){
                maxStr = word;
            }
        }
        return maxStr;
    }
    public static void main(String[] args) {
        // Collection ichidagi eng uzun String ni topish.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        Collection<String> collection = new ArrayList<>();
        for (int i=1;i<=n;i++){
            System.out.print(i + "-word=");
            String word = scanner.next();
            collection.add(word);
        }
        String res = findLongestStringFromArray(collection);
        System.out.println(res);
    }
}
