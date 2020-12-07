package com.startjava.lesson_2_3_4.robot;

import java.util.*;

public class Jaeger {
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strengh;
	private int armor;
	private boolean drift;

	Jaeger(String modelName) {
		this.modelName = modelName;
	}

	void setParameters(float height, float weight, int strengh, int speed, int armor) {
		this.height = height;
		this.weight = weight;
		this.strengh = strengh;
		this.speed = speed;
	}

	String getModelName() {
		return modelName;
	}

	String getMark() {
		return mark;
	}

	void setMark(String mark) {
		this.mark = mark;
	}

	String getOrigin() {
		return origin;
	}

	void setOrigin(String origin) {
		this.origin = origin;
	}

	float getHeight() {
		return height;
	}

	float getWeight() {
		return weight;
	}

	int getSpeed() {
		return speed;
	}

	int getStrengh() {
		return strengh;
	}

	int getArmor() {
		return armor;
	}

	void driftOn() {
		drift = true;
	}

	void driftOff() {
		drift = false;
	}

	boolean getDriftStatus() {
		return drift;
	}

	void move() {
		if (this.drift == true) {
			System.out.println("Jaeger are moved");
		}else System.out.println("Jaeger can't move without drifting");
	}

	String scanKaiju() {
		Random random = new Random();
		if (random.nextInt(10) < 3) {
			return "Kaiju detected";
		} else return "No kaiju in region";
	}
}