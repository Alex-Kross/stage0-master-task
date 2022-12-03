package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        int height = cathetusLength;
        int width = cathetusLength + cathetusLength - 1;
        int middle = width / 2 + 1;

        for (int i = 1; i < height + 1; i++) {
            int left = i - 1;
            int numberLeft = i;
            int numberRight = 2;

            for (int j = 1; j < width + 1; j++) {
                int right = j - middle;

                if (j < middle && middle - left == j) {
                    System.out.print(numberLeft);
                    left--;
                    numberLeft--;
                } else if (j == middle) {
                    System.out.print(1);
                } else if (j > middle && i > right) {
                    System.out.print(numberRight);
                    numberRight++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
