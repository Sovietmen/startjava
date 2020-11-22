import java.util.*;

public class GuessNumber {
	private Player player1;
	private Player player2;
	private Random random = new Random();
	private int secretNumber;
	private boolean win;

	GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	// void madeNumber() {
	// 	this.secretNumber = random.nextInt(100);
	// }

	void runGame() {
		this.win = false;
		Scanner scan = new Scanner(System.in);
		this.secretNumber = random.nextInt(100);
		while (!win) {
			//player1 checking
			System.out.println("--------" + player1.getPlayerName() + " turn--------");
			System.out.println("Guess the number in range 0 - 100: ");
			player1.setPlayerNumber(scan.nextInt());
			if (player1.getPlayerNumber() > secretNumber) {
				System.out.println("No. Your number more than my. Now turn to " + player2.getPlayerName());				
			} else if (player1.getPlayerNumber() < secretNumber) {
				System.out.println("No. Your number less than my. Now turn to " + player2.getPlayerName());
			} else if (player1.getPlayerNumber() == secretNumber) {
				System.out.println("Player " + player1.getPlayerName() + " are winner!!!");
				win = true;
			}

			//player2 checking
			System.out.println("--------" + player2.getPlayerName() + " turn--------");
			System.out.println("Guess the number in range 0 - 100: ");
			player2.setPlayerNumber(scan.nextInt());
			if (player2.getPlayerNumber() > secretNumber) {
				System.out.println("No. Your number more than my. Now turn to " + player1.getPlayerName());
			} else if (player2.getPlayerNumber() < secretNumber) {
				System.out.println("No. Your number less than my. Now turn to " + player1.getPlayerName());
			} else if(player2.getPlayerNumber() == secretNumber) {
				win = true;
				System.out.println("Player " + player2.getPlayerName() + " are winner!!!");
			}
		}
	}
}