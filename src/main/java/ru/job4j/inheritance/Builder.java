package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String tools;

    public Builder(String name, String surname, String education, String birthday, int category, String tools) {
        super(name, surname, education, birthday, category);
        this.tools = tools;
    }

    public String getTools() {
        return tools;
    }
}

