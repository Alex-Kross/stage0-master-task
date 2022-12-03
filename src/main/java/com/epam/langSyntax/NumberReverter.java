package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int ones = (number % 10) * 100;
        number /= 10;

        int tens = (number % 10) * 10;
        number /= 10;

        int hundreds = number % 10;

        int result = ones+ tens + hundreds;

        System.out.println(result);
    }

}
