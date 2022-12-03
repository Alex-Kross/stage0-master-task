package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int one = number % 10;
        number /= 10;

        int ten = number % 10;
        number /= 10;

        int hundred = number % 10;
        number /= 10;

        int thousand = number % 10;

        int sum = one + ten + hundred + thousand;

        System.out.println(sum);
    }

}
