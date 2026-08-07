package com.web.java_dsa.basic.dsa.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Generic Collection utility yozish.

public class GenericCollectionUtility {

    private GenericCollectionUtility(){
        throw new UnsupportedOperationException("Utility class");
    }

    public static boolean isNullOrEmpty(Collection<?> collection){
        return collection == null || collection.isEmpty();
    }

    public static <T> String join(Collection<T> collection,String delimiter){
        if (isNullOrEmpty(collection)){
            return "";
        }
        return collection
                .stream()
                .filter(Objects::nonNull)
                .map(Object::toString)
                .collect(Collectors.joining(delimiter));
    }

    public static <T> List<T> filter(Collection<T> collection, Predicate<T> predicate){
        if (isNullOrEmpty(collection) || predicate == null){
            return new ArrayList<>();
        }
        return collection
                .stream().filter(predicate).collect(Collectors.toList());
    }
}
