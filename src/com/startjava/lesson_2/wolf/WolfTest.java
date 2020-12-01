package com.startjava.lesson_2.wolf;

import java.util.*;

public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		System.out.println("Set wolf nickname: ");
		Scanner scan = new Scanner(System.in);
		wolf.setNickname(scan.next());
		System.out.println("Set wolf sex: ");
		wolf.setSex(scan.next());
		System.out.println("Set wolf weight: ");
		wolf.setWeight(scan.nextInt());
		System.out.println("Set wolf age: ");
		wolf.setAge(Short.valueOf(scan.next()));
		System.out.println("Set wolf color: ");
		wolf.setColor(scan.next());

		System.out.println("Wolf nickname is "+wolf.getNickname());
		System.out.println("Wolf age is "+wolf.getAge());
		System.out.println("Wolf sex is "+wolf.getSex());
		System.out.println("Wolf color is "+wolf.getColor());
		System.out.println("Wolf weight is "+wolf.getWeight());

		wolf.walk();
		wolf.sit();
		wolf.run();
		wolf.hunt();
	}
}