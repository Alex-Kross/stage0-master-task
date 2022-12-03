package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year > 0 && month >= 1 && month <= 12) {
            boolean isLeap;

            switch (year) {
                case 1900:
                case 2100:
                case 2200:
                case 2300:
                case 2500:
                case 2600:
                case 2700:
                case 2900:
                case 3000:
                    isLeap = false;
                    break;
                default:
                    int number = year % 10;

                    switch (number) {
                        case 0:
                        case 2:
                        case 4:
                        case 6:
                        case 8:
                            isLeap = true;
                            break;
                        default:
                            isLeap = false;
                    }
            }

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println(31);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(30);
                    break;
                case 2:
                    System.out.println(isLeap ? 29 : 28);
                    break;
            }
        } else {
            System.out.println("invalid date");
        }
    }

}
