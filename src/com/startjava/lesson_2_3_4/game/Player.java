package com.startjava.lesson_2_3_4.game;

public class Player {
	private String name;
	private int number;

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
	}

	int getNumber() {
		return number;
	}
}