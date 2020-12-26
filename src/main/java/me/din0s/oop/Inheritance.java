package me.din0s.oop;

public class Inheritance {
    public static void main(String[] args) {
        Cow calvinTheCow = new Cow();
        calvinTheCow.showInfo();

        Human me = new Human("Konstantinos");
        me.showInfo();
        me.rename("dinos");
        me.showInfo();

        Shark simonTheShark = new Shark();
        simonTheShark.showInfo();
        simonTheShark.die();
        simonTheShark.showInfo();

        Animal animal;
        animal = calvinTheCow;
        animal.die();
        animal.showInfo();
    }
}

abstract class Animal {
    private final int legs;
    private boolean isAlive;

    Animal(int legs) {
        this.legs = legs;
        this.isAlive = true;
    }

    void die() {
        this.isAlive = false;
    }

    void showInfo() {
        System.out.printf("Hi, I'm an animal with %d legs%n", legs);
        System.out.println("I'm currently " + (isAlive ? "alive" : "dead"));
    }
}

abstract class Mammal extends Animal {
    private final boolean isVegetarian;

    Mammal(boolean isVegetarian) {
        super(4);
        this.isVegetarian = isVegetarian;
    }

    Mammal(int legs, boolean isVegetarian) {
        super(legs);
        this.isVegetarian = isVegetarian;
    }

    @Override
    void showInfo() {
        super.showInfo();
        if (isVegetarian) {
            System.out.println("I'm also vegetarian!");
        }
    }
}

abstract class Fish extends Animal {
    Fish() {
        super(0);
    }
}

class Cow extends Mammal {
    Cow() {
        super(true);
    }
}

class Human extends Mammal {
    private String name;

    Human(String name) {
        super(2, false);
        this.name = name;
    }

    void rename(String name) {
        this.name = name;
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("My name is " + name);
    }
}

class Shark extends Fish {}
