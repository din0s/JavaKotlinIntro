package me.din0s.java14_15;

public class Records {
    record Dog(String name) {
        void bark() {
            System.out.printf("%s: woof%n", name);
        }
    }

    public static void main(String[] args) {
        var doggy = new Dog("Cookie");
        doggy.bark();
    }
}
