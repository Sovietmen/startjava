package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name of first player: ");
		Player player1 = new Player(scan.next());
		System.out.println("Enter name of second player: ");
		Player player2 = new Player(scan.next());
		GuessNumber game = new GuessNumber(player1, player2);
		String answer = "y";
		while (!answer.contentEquals("n")) {
			if (answer.contentEquals("y")) {
				game.start();
			}
			System.out.println("Do you want to continue? (y/n)");
			answer = scan.next();
		}
	}
}