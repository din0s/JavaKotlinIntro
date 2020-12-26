package me.din0s.oop.classes.animals;

public abstract class Animal {
    private final int legs;
    private boolean isAlive;

    public Animal(int legs) {
        this.legs = legs;
        this.isAlive = true;
    }

    public void die() {
        this.isAlive = false;
    }

    public void showInfo() {
        System.out.printf("Hi, I'm an animal with %d legs%n", legs);
        System.out.println("I'm currently " + (isAlive ? "alive" : "dead"));
    }
}
