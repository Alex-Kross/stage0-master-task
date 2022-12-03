package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        StringBuilder description = new StringBuilder();

        description.append("This animal is mostly ");
        description.append(color);
        description.append(". It has ");
        description.append(numberOfPaws);

        if (numberOfPaws > 1) {
            description.append(" paws and ");
        } else {
            description.append(" paw and ");
        }
        if (hasFur) {
            description.append("a fur.");
        } else {
            description.append("no fur.");
        }

        return description.toString();
    }
}
