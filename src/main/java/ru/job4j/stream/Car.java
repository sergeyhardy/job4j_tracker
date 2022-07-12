package ru.job4j.stream;

import java.time.LocalDate;

public class Car {
    private String brand;

    private String model;

    private LocalDate created;

    private double volume;

    private String color;

    static class Builder {
        private String brand;
        private String model;
        private LocalDate created;
        private double volume;
        private String color;

        Builder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildCreated(LocalDate created) {
            this.created = created;
            return this;
        }

        Builder buildVolume(double volume) {
            this.volume = volume;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Car build() {
            Car car = new Car();
            car.brand = brand;
            car.model = model;
            car.created = created;
            car.volume = volume;
            car.color = color;
            return car;

        }
    }

    @Override
    public String toString() {
        return "Car: " + System.lineSeparator()
                + "brand = " + brand + System.lineSeparator()
                + "model = " + model + System.lineSeparator()
                + "created = " + created + System.lineSeparator()
                + "volume = " + volume + System.lineSeparator()
                + "color = " + color + System.lineSeparator();
    }

    public static void main(String[] args) {
        Car car = new Builder()
                .buildBrand("Toyota")
                .buildModel("Camry")
                .buildCreated(LocalDate.of(2021, 6, 1))
                .buildVolume(2.5)
                .buildColor("Red")
                .build();
        System.out.println(car);

        Car secondCar = new Builder()
                .buildBrand("Nissan")
                .buildModel("Skyline")
                .buildCreated(LocalDate.of(1998, 5, 3))
                .buildVolume(2.0)
                .buildColor("Blue")
                .build();
        System.out.println(secondCar);
    }
}