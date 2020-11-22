public class Player {
	private String playerName;
	private int playerNumber;

	Player() {
		
	}

	void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	String getPlayerName() {
		return this.playerName;
	}

	int getPlayerNumber() {
		return this.playerNumber;
	}
}