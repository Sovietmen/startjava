public class Player {
	private String name;
	private int number;

	Player(String name) {
		this.name = name;
	}

	void setNumber(int number) {
		this.number = number;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getNumber() {
		return number;
	}
}