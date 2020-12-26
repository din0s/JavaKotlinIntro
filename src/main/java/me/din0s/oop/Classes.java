package me.din0s.oop;

import me.din0s.oop.classes.vehicles.Car;

public class Classes {
    public static void main(String[] args) {
        Car myCar1 = new Car("BMW M8", 600);
        myCar1.showInfo();
        System.out.println();
        myCar1.setLicensePlate("ABC-1234");
        myCar1.showInfo();
        System.out.println();

        Car myCar2 = new Car("Audi A4", 188, "XYZ-0101");
        myCar2.showInfo();
    }
}
