package com.epam.OOP;

public class Bird extends Animal {
    public Bird(){
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder();

        description.append(super.getDescription());
        description.append(" Moreover, it has 2 wings and can fly.");

        return description.toString();
    }
}
