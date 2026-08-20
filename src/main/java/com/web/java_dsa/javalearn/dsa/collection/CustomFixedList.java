package com.web.java_dsa.javalearn.dsa.collection;

import java.util.AbstractList;

// Custom Collection yaratish.

public class CustomFixedList<E> extends AbstractList<E> {
    private final E[] internalArray;

    public CustomFixedList(E[] internalArray) {
        this.internalArray = internalArray;
    }

    @Override
    public E get(int i) {
        return internalArray[i];
    }

    @Override
    public int size() {
        return internalArray.length;
    }
    @Override
    public E set(int index,E element){
        E oldValue = internalArray[index];
        internalArray[index]=element;
        return oldValue;
    }
}
