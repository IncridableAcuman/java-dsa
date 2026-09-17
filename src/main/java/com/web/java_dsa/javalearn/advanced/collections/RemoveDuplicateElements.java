package com.web.java_dsa.javalearn.advanced.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
public class RemoveDuplicateElements {
    public static void main(String[] args) {
        // 35. List<Integer> ichidagi takroriy elementlarni olib tashlang.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            System.out.print(i + "-element=");
            int element = scanner.nextInt();
            list.add(element);
        }
        list
                .stream()
                .distinct()
                .forEach(integer -> System.out.print(integer + " "));
    }
    /usr/lib/jvm/java-17-openjdk-amd64/bin/java -javaagent:/snap/intellij-idea-community/812/lib/intellij.platform.coverage.agent.jar=/tmp/coverage404251100648646012args -Didea.coverage.calculate.hits=true -javaagent:/snap/intellij-idea-community/812/lib/idea_rt.jar=36177 -Dfile.encoding=UTF-8 -classpath /home/izzatbek/Desktop/java_master/build/classes/java/main:/home/izzatbek/Desktop/java_master/build/resources/main:/home/izzatbek/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter/4.1.0/4d1f5fcf982ec75223a3ee44169e268b6dd044f7/spring-boot-starter-4.1.0.jar:/home/izzatbek/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter-logging/4.1.0/f2e2615d9fb27a035a8fc7aef19670769739ae76/spring-boot-starter-logging-4.1.0.jar:/home/izzatbek/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-autoconfigure/4.1.0/a921df4e39389e43dacac5615a1185708ee8a960/spring-boot-autoconfigure-4.1.0.jar:/home/izzatbek/.gradle/caches/modules-2/files-2.1/jakarta.annotation/jakarta.annotation-api/3.0.0/54f928fadec906a99d558536756d171917b9d936/jakarta.annotation-api-3.0.0.jar:/home/izzatbek/.gradle/caches/modules-2/files-2.1/org.yaml/snakeyaml/2.6/2bc14918a2f8d5414749ab12d0c590cd3198b8c1/snakeyaml-2.6.jar:/home/izzatbek/.gradle/caches/modules-2/files-2.1/ch.qos.logback/logback-classic/1.5.34/e598899bad5824511cd3019299254230468e1fa2/logback-classic-1.5.34.jar:/home/izzatbek/.gradle/caches/modules-2/files-2.1/org.apache.logging.log4j/log4j-to-slf4j/2.25.4/68df56640a5d245192e91bd2ac89e504b477cc10/log4j-to-slf4j-2.25.4.jar:/home/izzatbek/.gradle/caches/modules-2/files-2.1/org.slf4j/jul-to-slf4j/2.0.18/79739c98001d5c9d078d087d5a348ec9e474ec8f/jul-to-slf4j-2.0.18.jar:/home/izzatbek/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot/4.1.0/bcf26d4c27ab080ef60c13220e96a37d687f9e26/spring-boot-4.1.0.jar:/home/izzatbek/.gradle/caches/modules-2/files-2.1/ch.qos.logback/logback-core/1.5.34/378692f76c337b3325c15bffb89e013dc1f897b4/logback-core-1.5.34.jar:/home/izzatbek/.gradle/caches/modules-2/files-2.1/org.slf4j/slf4j-api/2.0.18/78a9e7a37cd6360e0b818e86341b24123d28d4df/slf4j-api-2.0.18.jar:/home/izzatbek/.gradle/caches/modules-2/files-2.1/org.apache.logging.log4j/log4j-api/2.25.4/89ff2217b193fb187b134aa6ebcbfa8a28b018a9/log4j-api-2.25.4.jar:/home/izzatbek/.gradle/caches/modules-2/files-2.1/org.jspecify/jspecify/1.0.0/7425a601c1c7ec76645a78d22b8c6a627edee507/jspecify-1.0.0.jar:/home/izzatbek/.gradle/caches/modules-2/files-2.1/org.springframework/spring-context/7.0.8/6c58b590fd8d71afc36797cf6555e82500f1eb64/spring-context-7.0.8.jar:/home/izzatbek/.gradle/caches/modules-2/files-2.1/org.springframework/spring-core/7.0.8/25f5ebd179f92d7d12779e3761c96da4b0109ad/spring-core-7.0.8.jar:/home/izzatbek/.gradle/caches/modules-2/files-2.1/org.springframework/spring-aop/7.0.8/b73e58e9b7dbc4db6b4ebbe3336be0e901b0d261/spring-aop-7.0.8.jar:/home/izzatbek/.gradle/caches/modules-2/files-2.1/org.springframework/spring-beans/7.0.8/829cdf4c82a9409e0e10922b9e57e2ef12d5f04d/spring-beans-7.0.8.jar:/home/izzatbek/.gradle/caches/modules-2/files-2.1/org.springframework/spring-expression/7.0.8/bb844eefd513820e356b575d7ea0f7084147af59/spring-expression-7.0.8.jar:/home/izzatbek/.gradle/caches/modules-2/files-2.1/io.micrometer/micrometer-observation/1.17.0/2037bdaeb5725bdddb2390cbf93be3c19f8b8b48/micrometer-observation-1.17.0.jar:/home/izzatbek/.gradle/caches/modules-2/files-2.1/commons-logging/commons-logging/1.3.6/63e78ca6cd446c0ad166d14f03ed99e7efb3896d/commons-logging-1.3.6.jar:/home/izzatbek/.gradle/caches/modules-2/files-2.1/io.micrometer/micrometer-commons/1.17.0/2edbb561cdd2b2777fbcd83aa9f2204ebabf592b/micrometer-commons-1.17.0.jar:/home/izzatbek/Desktop/java_master/build/classes/java/aot:/home/izzatbek/Desktop/java_master/build/resources/aot com.web.java_dsa.javalearn.advanced.collections.RemoveDuplicateElements
//n=9
//1-element=1
//2-element=1
//3-element=2
//4-element=3
//5-element=3
//6-element=4
//7-element=5
//8-element=5
//9-element=6
//1 2 3 4 5 6
//Process finished with exit code 0
// bunda takrorlanganlarni bittasi qoladi qolgani o'chiriladi Set ga asoslangan. Qisqacha aytganda
// to'liq o'chmaydi takrorlangan sonlar agar takrorlanganlarni umuman olmaslik uchun quyidagicha bo'ladi
}
*/
public class RemoveDuplicateElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            System.out.print(i + "-element=");
            int element = scanner.nextInt();
            list.add(element);
        }
        Map<Integer,Long> map =  list
                .stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        list
                .removeIf(integer -> map.get(integer) > 1);

        for (Integer integer : list){
            System.out.print(integer + " ");
        }
    }
}