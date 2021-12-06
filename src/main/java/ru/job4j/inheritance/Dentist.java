package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private boolean canProsthetic;

    public Dentist(String name, String surname, String education, String birthday, int experience, boolean canProsthetic) {
        super(name, surname, education, birthday, experience);
        this.canProsthetic = canProsthetic;
    }

    public boolean getCanProsthetic() {
        return canProsthetic;
    }
}
