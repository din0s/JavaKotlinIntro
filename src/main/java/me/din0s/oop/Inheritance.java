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
        System.out.println();
        runShapes();
    }

    private static void runAnimals() {
        Cow calvinTheCow = new Cow();
        calvinTheCow.showInfo();
        calvinTheCow.makeMilk();
        System.out.println();

        Human me = new Human("Konstantinos");
        me.showInfo();
        me.rename("dinos");
        System.out.println();
        me.showInfo();
        System.out.println();

        Shark simonTheShark = new Shark();
        simonTheShark.showInfo();
        simonTheShark.die();
        System.out.println();
        simonTheShark.showInfo();
        System.out.println();

        Animal animal;
        animal = calvinTheCow;
        animal.die();
        animal.showInfo();
    }

    private static void runShapes() {
        Rectangle rect = new Rectangle(5.5, 2);
        rect.showInfo();
        System.out.println();

        Square square = new Square(3);
        square.showInfo();
        System.out.println();

        Circle circle = new Circle(1);
        circle.showInfo();
        System.out.println();

        Shape2D shape = new Circle(10);
        shape.showInfo();
    }
}
