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

	void driftOn() {
		this.drift = true;
	}

	void driftOff() {
		this.drift = false;
	}

	//setters
	void setMark(String mark) {
		this.mark = mark;
	}

	void setOrigin(String origin) {
		this.origin = origin;
	}

	void setParameters(float height, float weight, int strengh, int speed, int armor) {
		this.height = height;
		this.weight = weight;
		this.strengh = strengh;
		this.speed = speed;
	}

	//getters
	String getModelName() {
		return this.modelName;
	}

	String getMark() {
		return this.mark;
	}

	String getOrigin() {
		return this.origin;
	}

	float getHeight() {
		return this.height;
	}

	float getWeight() {
		return this.weight;
	}

	int getStrengh() {
		return this.strengh;
	}

	int getSpeed() {
		return this.speed;
	}

	int getArmor() {
		return this.armor;
	}
	boolean getDriftStatus() {
		return this.drift;
	}

	//function
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