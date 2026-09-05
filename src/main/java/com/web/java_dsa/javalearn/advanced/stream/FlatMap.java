package com.web.java_dsa.javalearn.advanced.stream;

import java.util.Collection;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        // 🔴 8-bosqich — flatMap()
        //
        //Bu map()dan biroz murakkabroq.
        //
        //25. List ichidagi List'larni birlashtirish
        //
        //Berilgan:
        //
        //List<List<Integer>> numbers =
        //        List.of(
        //            List.of(1, 2, 3),
        //            List.of(4, 5),
        //            List.of(6, 7, 8)
        //        );
        //
        //flatMap() yordamida:
        //
        //[1, 2, 3, 4, 5, 6, 7, 8]
        //
        //oling.
        List<List<Integer>> numbers = List.of(
                List.of(1,2,3),
                List.of(4,5,6),
                List.of(7,8,9)
        );
        numbers
                .stream()
                .flatMap(Collection::stream)
                .forEach(integer -> System.out.print(integer + " "));
    }
}
