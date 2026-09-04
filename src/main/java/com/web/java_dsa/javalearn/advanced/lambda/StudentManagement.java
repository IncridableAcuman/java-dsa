package com.web.java_dsa.javalearn.advanced.lambda;

import java.util.*;

public class StudentManagement {
    public static void main(String[] args) {
        // 30. Mini loyiha — Student filtering
        //class Student {
        //    private String name;
        //    private int age;
        //    private double score;
        //}
        //
        //20 ta studentdan iborat List yarating.
        //
        //Lambda + Stream yordamida:
        //
        //score >= 70 studentlarni toping;
        //score >= 90 studentlarni toping;
        //eng yuqori ballni toping;
        //eng past ballni toping;
        //studentlarni score bo‘yicha sort qiling;
        //faqat student nomlarini oling;
        //o‘rtacha score'ni hisoblang;
        //nechta student o'tganini aniqlang;
        //18 yoshdan katta studentlarni toping;


        List<Student> students = new ArrayList<>();
        students.add(new Student("Izzatbek",22,85));
        students.add(new Student("Ismoil",21,95));
        students.add(new Student("Abror",22,70));
        students.add(new Student("Bahrom",19,90));
        students.add(new Student("Isobek",19,90));
        students.add(new Student("Bekzod",21,75));
        students.add(new Student("Saidbek",22,78));
        students.add(new Student("Fahriddin",22,60));
        students.add(new Student("Diyorbek",21,80));
        students.add(new Student("Shavkatbek",21,80));
        students.add(new Student("Shuhrat",23,72));
        students.add(new Student("Abbosbek",21,84));
        students.add(new Student("Polvonboy",21,76));
        students.add(new Student("Xudoybergan",21,75));
        students.add(new Student("Furqatbek",20,70));
        students.add(new Student("Zafarbek",22,65));
        students.add(new Student("Mahmudjon",21,67));
        students.add(new Student("Sa'natbek",21,65));
        students.add(new Student("Shonazar",23,85));
        students.add(new Student("Muhriddin",22,60));

       /*
        //score >= 70 studentlarni toping;
        students
                .stream()
                .filter(student -> student.getScore() >= 70)
                .forEach(System.out::println);

        */
       /*
        // //score >= 90 studentlarni toping;
        students
                .stream()
                .filter(student -> student.getScore() >= 90)
                .forEach(System.out::println);

        */

        //eng yuqori ballni toping;
       /* // first way
        OptionalDouble student = students
                .stream()
                .map(Student::getScore)
                .mapToDouble(Double::doubleValue).max();
        System.out.println(student.getAsDouble());*/
        /*
        //eng yuqori ballni toping; // second way
        Optional<Student> topStudent = students
                .stream()
                .max(Comparator.comparingDouble(Student::getScore));

        topStudent
                .ifPresent(System.out::println);

         */
        /*
        // //eng past ballni toping;
        Optional<Student> student = students
                .stream()
                .min(Comparator.comparingDouble(Student::getScore));
        student
                .ifPresent(System.out::println);

         */
        /*
        //studentlarni score bo‘yicha sort qiling;
        students
                .stream()
                .sorted(Comparator.comparingDouble(Student::getScore).reversed())
                .forEach(System.out::println);

         */
        /*
        //faqat student nomlarini oling;
        students
                .stream()
                .map(Student::getName)
                .forEach(System.out::println);

         */
        /*
        //o‘rtacha score'ni hisoblang; average
        OptionalDouble average = students
                .stream()
                .map(Student::getScore)
                .mapToDouble(Double::doubleValue).average();
        System.out.println(average.getAsDouble());

         */
        /*
        //nechta student o'tganini aniqlang;
        students
                .stream()
                .map(student -> student.getScore() >= 60)
                .forEach(System.out::println);

         */
        /*
        //21 yoshdan katta studentlarni toping;
        students
                .stream()
                .filter(student -> student.getAge() > 21)
                .forEach(System.out::println);

         */
    }
}
