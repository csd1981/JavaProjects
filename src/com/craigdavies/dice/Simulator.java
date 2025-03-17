package com.craigdavies.dice;

import java.util.Random;

public class Simulator {
    public static void main(String[] args) {
        Random rand = new Random();

        int rolledNumber = rand.nextInt(6) + 1;
        System.out.println(display(rolledNumber));
    }

    static String display(int value) {
        return switch (value) {
            case 1 -> "---------\n|       |\n|   o   |\n|       |\n---------";
            case 2 -> "---------\n| o     |\n|       |\n|     o |\n---------";
            case 3 -> "---------\n| o     |\n|   o   |\n|     o |\n---------";
            case 4 -> "---------\n| o   o |\n|       |\n| o   o |\n---------";
            case 5 -> "---------\n| o   o |\n|   o   |\n| o   o |\n---------";
            case 6 -> "---------\n| o   o |\n| o   o |\n| o   o |\n---------";
            default -> "No value returned.";
        };
    }
}
