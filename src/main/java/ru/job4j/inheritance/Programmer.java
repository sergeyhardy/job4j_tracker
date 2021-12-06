package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String technologyStack;

    public Programmer(String name, String surname, String education, String birthday, int category, String technologyStack) {
        super(name, surname, education, birthday, category);
        this.technologyStack = technologyStack;
    }

    public String getTechnologyStack() {
        return technologyStack;
    }
}

