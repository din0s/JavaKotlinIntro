package me.din0s.java8_9;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("hello");
        myList.add("world");

        // before
        for (String s : myList) {
            System.out.println(s);
        }

        // after
        myList.forEach(s -> System.out.println(s));

        // even better with a method reference
        myList.forEach(System.out::println);
    }
}
