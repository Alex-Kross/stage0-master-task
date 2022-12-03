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
            String str = "";
            for (int j = 1; j < width + 1; j++) {
                int right = j - middle;

                if (j < middle && middle - left == j) {
                    str += numberLeft;
                    left--;
                    numberLeft--;
                } else if (j == middle) {
                    str += 1;
                } else if (j > middle && i > right) {
                    str += numberRight;
                    numberRight++;
                } else {
                    str += " ";
                }
            }
            str = str.substring(0, str.length()/2) + str.substring(str.length()/2).trim();
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
