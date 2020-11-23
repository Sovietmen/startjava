import java.util.*;

public class GuessNumber {
	private Player player1;
	private Player player2;
	private Random random = new Random();
	private int secretNumber;
	
	GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	void runGame() {
		Scanner scan = new Scanner(System.in);
		secretNumber = random.nextInt(100);
		while (true) {
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
				break;
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
				System.out.println("Player " + player2.getPlayerName() + " are winner!!!");
				break;
			}
		}
	}
}