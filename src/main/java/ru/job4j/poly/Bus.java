package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Автобус начал движение");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Количество пассажиров в автобусе" + count);
    }

    @Override
    public double refuel(double liters) {
        return liters * 52;
    }
}
