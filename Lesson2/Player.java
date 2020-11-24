public class Player {
	private String name;
	private int number;

	Player(String name) {
		this.name = name;
	}

	void setNumber(int number) {
		this.number = number;
	}

	int getNumber() {
		return number;
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
}