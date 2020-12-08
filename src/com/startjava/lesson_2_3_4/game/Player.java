package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int number;
    private int[] tryes = new int[10];
    private int tryCount;

    Player(String name) {
        this.name = name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setNumber(int number) {
        this.number = number;
        tryCount++;
        tryes[tryCount - 1] = number;
    }

    int getTryCount() {
        return tryCount;
    }

    int[] getTryes() {
        return tryes;
    }

    void clearTryes() {
        int i = 0;
        while (tryes[i] != 0) {
            tryes[i] = 0;
            i++;
        }
        tryCount = 0;
    }

    int getNumber() {
        return number;
    }
}