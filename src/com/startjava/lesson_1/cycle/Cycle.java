package com.startjava.lesson_1.cycle;

public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.print(i + " ");
		}

		int i = -6;
		System.out.println();
		while ((i >= -6) && (i <= 6)) {
			System.out.print(i + " ");
			i += 2;
		}

		System.out.println();
		i = 10;
		int sum = 0;
		do {
			if(i % 2 != 0) {
				sum++;
			}
			i++;
		} while(i <= 20);
		System.out.print(sum);
	}
}