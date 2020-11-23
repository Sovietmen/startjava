public class Player {
	private String name;
	private int number;

	Player() {
		
	}

	Player(String name) {
		this.name = name;
	}

	void setPlayerNumber(int number) {
		this.number = number;
	}

	String getPlayerName() {
		return name;
	}

	void setPlayerName(String name) {
		this.name = name;
	}

	int getPlayerNumber() {
		return number;
	}
}