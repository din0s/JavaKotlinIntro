package me.din0s.oop.classes.animals.mammals;

import me.din0s.oop.classes.animals.Mammal;

public class Human extends Mammal {
    private String name;

    public Human(String name) {
        super(2, false);
        this.name = name;
    }

    public void rename(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("My name is " + name);
    }
}
