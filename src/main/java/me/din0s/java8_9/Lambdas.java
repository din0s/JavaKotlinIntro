package me.din0s.java8_9;

import java.util.Arrays;
import java.util.Comparator;

public class Lambdas {
    public static void main(String[] args) {
        // before
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("The runnable has run");
            }
        };

        // after
        Runnable myRunnable8 = () -> System.out.println("The runnable has run");

        String[] myStrs = { "hi", "hello" };

        // before
        Arrays.sort(myStrs, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.length() - s1.length();
            }
        });

        // after
        Arrays.sort(myStrs, (s1, s2) -> s2.length() - s1.length());
    }
}
