package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] tryes = new int[10];
    private int tryCount;

    Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setNumber(int number) {
        tryCount++;
        tryes[tryCount - 1] = number;
    }

    int getTryCount() {
        return tryCount;
    }

    int[] getTryes() {
        return Arrays.copyOf(tryes, tryCount);
    }

    void clearTryes() {
        Arrays.fill(tryes, 0, tryCount, 0);
        tryCount = 0;
    }
}