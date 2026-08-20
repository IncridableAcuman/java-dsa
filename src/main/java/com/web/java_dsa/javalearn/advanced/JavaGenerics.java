package com.web.java_dsa.javalearn.advanced;

class Box<T>{
    private T object;

    public void set(T object){
        this.object=object;
    }
    T getObject(){
        return object;
    }
}

class Stats <T extends Number>{
    T[] nums;
    Stats(T[] nums){
        this.nums=nums;
    }
    double average(){
        double sum = 0;
        for (T num : nums){
            sum += num.doubleValue();
        }
        return sum / nums.length;
    }
}


public class JavaGenerics {
    public static <T> void iterateArray(T[] arr){
        for (T x : arr){
            System.out.print(x + " ");
        }
    }
    public static void main(String[] args) {
        String[] strings = {"Apple","Peach","Banana"};
        iterateArray(strings);

        Integer[] integers = {1,2,3};
        iterateArray(integers);

        Integer[] integerNums = {1,2,3};
        Stats<Integer> integerStats = new Stats<>(integerNums);
        System.out.println(integerStats.average());

        Double[] doubleNums = {1.2,2.3,3.4};
        Stats<Double> doubleStats = new Stats<>(doubleNums);
        System.out.println(doubleStats.average());
    }
}
