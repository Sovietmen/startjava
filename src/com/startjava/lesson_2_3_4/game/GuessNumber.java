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
            inputNumber(player1);
            if (checkToWin(player1)) {
                break;
            }
            inputNumber(player2);
            if (checkToWin(player2)) {
                break;
            }
            if (enoughTryCount(player1)) break;
            if (enoughTryCount(player2)) break;
        }
        showResult(player1);
        showResult(player2);
        System.out.println();
    }

    private void inputNumber(Player player) {
        System.out.println("--------" + player.getName() + " turn--------");
        System.out.println("Guess the number in range 0 - 100: ");
        player.setNumber(scan.nextInt());
    }

    private boolean checkToWin(Player player) {
        int playerNumber = player.getTryes()[player.getTryCount() - 1];
        if (playerNumber == secretNumber) {
            System.out.println("Player " + player.getName() + " are guess the number " + secretNumber + " on the " + player.getTryCount() + " try!!!");
            return true;
        }
        String moreLessCheck = (playerNumber > secretNumber) ? " more " : " less ";
        System.out.println("No. Your number" + moreLessCheck + "than my. Now turn to next player.");
        return false;
    }

    private void showResult(Player player) {
        System.out.print(player.getName() + ": ");
        for (int numbers : player.getTryes()) {
            System.out.print(numbers + " ");
        }
        System.out.println();
    }

    private boolean enoughTryCount(Player player) {
        if (player.getTryCount() == 10) {
            System.out.println(player.getName() + " have not enough tryes. Game over.");
            return true;
        }
        return false;
    }
}