package com.startjava.lesson_2.wolf;

public class Wolf {
	private String nickname;
	private String sex;
	private int weight;
	private short age;
	private String color;

	public Wolf() {

	}

	public void walk() {
		System.out.println("I'm wolk forward");
	}

	public void sit() {
		System.out.println("I'm sitting");
	}

	public void run() {
		System.out.println("I'm running");
	}

	public void hunt() {
		System.out.println("I'm hunting");
	}

	public void setAge(short age) {
		if (age > 8) {
			System.out.println("Incorrect value of age. Max value are setted.");
			this.age = 8;
		} else this.age = age;
	}

	public short getAge() {
		return this.age;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setSex(String sex) {
		if ((sex.contentEquals("female"))||(sex.contentEquals("f"))) {
			this.sex = "female";
		} else if ((sex.contentEquals("male"))||(sex.contentEquals("m"))) {
			this.sex = "male";
		} else {
			System.out.println("Wrong sex. Male is setted");
			this.sex = "male";
		}
	}

	public String getSex() {
		return this.sex;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}
}