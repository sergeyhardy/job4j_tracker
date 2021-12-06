package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private int numberOfOperations;

    public Surgeon(String name, String surname, String education, String birthday, int experience, int numberOfOperations) {
        super(name, surname, education, birthday, experience);
        this.numberOfOperations = numberOfOperations;
    }

    public int getNumberOfOperations() {
        return numberOfOperations;
    }
}
