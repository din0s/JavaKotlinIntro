package me.din0s.oop;

public class Classes {
    public static void main(String[] args) {
        Car myCar1 = new Car("BMW M8", 600);
        myCar1.showInfo();
        myCar1.setLicensePlate("ABC-1234");
        myCar1.showInfo();

        Car myCar2 = new Car("Audi A4", 188, "XYZ-0101");
        myCar2.showInfo();
    }

}

class Car {
    private final String model;
    private final int horsepower;
    private String licensePlate;

    Car(String model, int horsepower) {
        this.model = model;
        this.horsepower = horsepower;
    }

    Car(String model, int horsepower, String licensePlate) {
        this.model = model;
        this.licensePlate = licensePlate;
        this.horsepower = horsepower;
    }

    public String getModel() {
        return model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String plate) {
        this.licensePlate = plate;
    }

    public void showInfo() {
        // Did you know cars can talk?
        System.out.printf("Hi! I'm a %s with %dhp%n", model, horsepower);
        if (licensePlate != null) {
            System.out.println("My registered license plate is " + licensePlate);
        }
    }
}
