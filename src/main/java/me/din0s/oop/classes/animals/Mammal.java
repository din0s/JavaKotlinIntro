package me.din0s.oop.classes.animals;


public abstract class Mammal extends Animal {
    private final boolean isVegetarian;

    public Mammal(boolean isVegetarian) {
        super(4);
        this.isVegetarian = isVegetarian;
    }

    public Mammal(int legs, boolean isVegetarian) {
        super(legs);
        this.isVegetarian = isVegetarian;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        if (isVegetarian) {
            System.out.println("I'm also vegetarian!");
        }
    }
}
