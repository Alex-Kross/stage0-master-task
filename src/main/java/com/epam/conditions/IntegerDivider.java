package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if (divider != 0) {
            double result = dividend / divider;
            System.out.println(result * divider == dividend ? "can be divided completely" :
                    "cannot be divided completely");
        } else {
            System.out.println("division by zero");
        }
    }

}
