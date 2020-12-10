package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Random random = new Random();
    private int secretNumber;
    private Scanner scan = new Scanner(System.in);

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    void start() {
        player1.clearTryes();
        player2.clearTryes();
        secretNumber = random.nextInt(100);
        System.out.println("Game started. You each have 10 tryes!");
        while (true) {
            requestForNumber(player1);
            if (checkToWin(player1)) {
                break;
            } else {
                requestForNumber(player2);
                if (checkToWin(player2)) {
                    break;
                }
            }
            if (player1.getTryCount() == 10) {
                System.out.println(player1.getName() + " have not enough tryes. Game over.");
                break;
            }
            if (player2.getTryCount() == 10) {
                System.out.println(player2.getName() + " have not enough tryes. Game over.");
                break;
            }
        }
        showResult(player1);
        showResult(player2);
        System.out.println();
    }

    void requestForNumber(Player player) {
        System.out.println("--------" + player.getName() + " turn--------");
        System.out.println("Guess the number in range 0 - 100: ");
        player.setNumber(scan.nextInt());
    }

    boolean checkToWin(Player player) {
        if (player.getTryes()[player.getTryCount() - 1] > secretNumber) {
            System.out.println("No. Your number more than my. Now turn to next player.");
        } else if (player.getTryes()[player.getTryCount() - 1] < secretNumber) {
            System.out.println("No. Your number less than my. Now turn to next player.");
        } else if (player.getTryes()[player.getTryCount() - 1] == secretNumber) {
            System.out.println("Player " + player.getName() + " are guess the number " + secretNumber + " on the " + player.getTryCount() + " try!!!");
            return true;
        }
        return false;
    }

    void showResult(Player player) {
        System.out.print(player.getName() + ": ");
        for (int ints : player.getTryes()) {
            System.out.print(ints + " ");
        }
        System.out.println();
    }
}