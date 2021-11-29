package ru.job4j.oop;

public class Error {

    private boolean active;

    private int status;

    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активность: " + active);
        System.out.println("Класс состояния: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error first = new Error();
        first.printInfo();
        Error second = new Error(false, 404, "не найдено");
        second.printInfo();
        Error third = new Error(true, 418, "я — чайник");
        third.printInfo();
    }
}
