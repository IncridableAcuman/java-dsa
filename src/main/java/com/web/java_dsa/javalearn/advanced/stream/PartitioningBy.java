package com.web.java_dsa.javalearn.advanced.stream;

import com.web.java_dsa.javalearn.advanced.lambda.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningBy {
    public static void main(String[] args) {

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
        // 23. Studentlarni ikki guruhga ajrating
        //List<Integer> scores =
        //        List.of(45, 67, 82, 91, 56, 38, 74);
        //
        //Studentlarni:
        //
        //Passed  → score >= 60
        //Failed  → score < 60
        //
        //ko‘rinishida ikkiga ajrating.
        //
        //partitioningBy() ishlating.
        Map<Boolean,List<Student>> map = students
                .stream()
                .collect(Collectors.partitioningBy(student -> student.getScore() >=80));

        for (Map.Entry<Boolean,List<Student>> entry : map.entrySet()){
            String groupName = entry.getKey() ? "Passed (>=80)" : "Failed (<=70)";
            System.out.println(
                    groupName + " -> " + entry
                            .getValue()
                            .stream()
                            .map(student -> student.getName() + "(" + student.getScore() + ")")
                            .toList()
            );
        }
    }
}
