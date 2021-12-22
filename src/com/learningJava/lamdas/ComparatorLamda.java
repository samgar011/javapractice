package com.learningJava.lamdas;

import java.util.Comparator;

public class ComparatorLamda {

    public static void main(String[] args) {

        Comparator <Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Comparing Result is :" + comparator.compare(5,2));
//new compare lamda method
        Comparator <Integer> integerComparator= (Integer a, Integer b)-> {
            return a.compareTo(b);

        };

        System.out.println("new comparing result is :" + integerComparator.compare(6,3));

//        Different Lamda Samples

    }

}
