package me.din0s.java7;

public class Loops {
    public static void main(String[] args) {
        int[] myInts = { 1, 3, 3, 7 };

        for (int i = 0; i < myInts.length; i++) {
            int integer = myInts[i];
            System.out.println(integer);
        }

        for (int integer : myInts) {
            System.out.println(integer);
        }
    }
}
