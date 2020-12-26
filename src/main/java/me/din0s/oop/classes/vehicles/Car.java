package me.din0s.oop.classes.vehicles;

public class Car {
    private final String model;
    private final int horsepower;
    private String licensePlate;

    public Car(String model, int horsepower) {
        this.model = model;
        this.horsepower = horsepower;
    }

    public Car(String model, int horsepower, String licensePlate) {
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
