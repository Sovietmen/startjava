package com.startjava.lesson_2.guessNumber;

import java.util.*;

public class GuessNumber {
	private Player player1;
	private Player player2;
	private Random random = new Random();
	private int secretNumber;
	
	GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	void start() {
		Scanner scan = new Scanner(System.in);
		secretNumber = random.nextInt(100);
		while (true) {
			//player1 checking
			System.out.println("--------" + player1.getName() + " turn--------");
			System.out.println("Guess the number in range 0 - 100: ");
			player1.setNumber(scan.nextInt());
			if (player1.getNumber() > secretNumber) {
				System.out.println("No. Your number more than my. Now turn to " + player2.getName());				
			} else if (player1.getNumber() < secretNumber) {
				System.out.println("No. Your number less than my. Now turn to " + player2.getName());
			} else if (player1.getNumber() == secretNumber) {
				System.out.println("Player " + player1.getName() + " are winner!!!");
				break;
			}

			//player2 checking
			System.out.println("--------" + player2.getName() + " turn--------");
			System.out.println("Guess the number in range 0 - 100: ");
			player2.setNumber(scan.nextInt());
			if (player2.getNumber() > secretNumber) {
				System.out.println("No. Your number more than my. Now turn to " + player1.getName());
			} else if (player2.getNumber() < secretNumber) {
				System.out.println("No. Your number less than my. Now turn to " + player1.getName());
			} else if(player2.getNumber() == secretNumber) {
				System.out.println("Player " + player2.getName() + " are winner!!!");
				break;
			}
		}
	}
}