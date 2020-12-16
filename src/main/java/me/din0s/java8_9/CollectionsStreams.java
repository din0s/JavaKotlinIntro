package me.din0s.java8_9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionsStreams {
    public static void main(String[] args) {
        // initialize
        List<String> myList = new ArrayList<>();
        myList.add("bravo");
        myList.add("delta");
        myList.add("echo");

        // filter
        List<String> myTransformedList = new ArrayList<>();
        for (String s : myList) {
            if (s.contains("o")) {
                myTransformedList.add(s);
            }
        }

        // map
        for (String s : myTransformedList) {
            String t = s.substring(0, 1).toUpperCase() + s.substring(1);
            myTransformedList.remove(s);
            myTransformedList.add(t);
        }

        // sort
        myTransformedList.sort(Comparator.naturalOrder());

        // print
        for (String s : myTransformedList) {
            System.out.println(s);
        }

        // initialize
        List<String> mySimpleList = List.of("bravo", "delta", "echo");

        // and...
        mySimpleList.stream()
                .filter(s -> s.contains("o"))
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .sorted()
                .forEach(System.out::println);
        // magic.
    }
}
