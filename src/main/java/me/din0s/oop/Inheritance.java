package me.din0s.oop;

import me.din0s.oop.classes.animals.Animal;
import me.din0s.oop.classes.animals.fish.Shark;
import me.din0s.oop.classes.animals.mammals.Cow;
import me.din0s.oop.classes.animals.mammals.Human;
import me.din0s.oop.classes.shapes.Circle;
import me.din0s.oop.classes.shapes.Rectangle;
import me.din0s.oop.classes.shapes.Shape2D;
import me.din0s.oop.classes.shapes.Square;

public class Inheritance {
    public static void main(String[] args) {
        runAnimals();
        runShapes();
    }

    private static void runAnimals() {
        Cow calvinTheCow = new Cow();
        calvinTheCow.showInfo();
        calvinTheCow.makeMilk();

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

    private static void runShapes() {
        Rectangle rect = new Rectangle(5.5, 2);
        rect.showInfo();

        Square square = new Square(3);
        square.showInfo();

        Circle circle = new Circle(1);
        circle.showInfo();

        Shape2D shape = new Circle(10);
        shape.showInfo();
    }
}
