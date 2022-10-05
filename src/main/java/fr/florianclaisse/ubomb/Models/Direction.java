package fr.florianclaisse.ubomb.Models;

import java.util.Random;

public enum Direction {

    UP, RIGHT, DOWN, LEFT;

    private static final Random randomGenerator = new Random();

    public static Direction random() {
        int i = randomGenerator.nextInt(values().length);
        return values()[i];
    }
}
