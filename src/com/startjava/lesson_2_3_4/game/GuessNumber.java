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
            if (playerTurn(player1)) {
                break;
            } else if (playerTurn(player2)) {
                break;
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
        System.out.print(player1.getName() + ": ");
        for (int i = 0; i < player1.getTryCount(); i++) {
            System.out.print(player1.getTryes()[i] + " ");
        }
        System.out.println();
        System.out.print(player2.getName() + ": ");
        for (int i = 0; i < player2.getTryCount(); i++) {
            System.out.print(player2.getTryes()[i] + " ");
        }
        System.out.println();
    }

    boolean playerTurn(Player player) {
        System.out.println("--------" + player.getName() + " turn--------");
        System.out.println("Guess the number in range 0 - 100: ");
        player.setNumber(scan.nextInt());
        if (player.getNumber() > secretNumber) {
            System.out.println("No. Your number more than my. Now turn to next player.");
            return false;
        } else if (player.getNumber() < secretNumber) {
            System.out.println("No. Your number less than my. Now turn to next player.");
            return false;
        } else if (player.getNumber() == secretNumber) {
            System.out.println("Player " + player.getName() + " are guess the number " + secretNumber + " on the " + player.getTryCount() + " try!!!");
            return true;
        }
        return false;
    }
}