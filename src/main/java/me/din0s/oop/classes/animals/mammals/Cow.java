package me.din0s.oop.classes.animals.mammals;

import me.din0s.oop.classes.animals.Mammal;

public class Cow extends Mammal {
    public Cow() {
        super(true);
    }

    public void makeMilk() {
        System.out.println("Okay, I made milk.");
    }
}
