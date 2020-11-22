import java.util.*;

public class GuessNumberTest {
	public static void main(String[] args) {
		boolean newGame = true;
		Player player1 = new Player();
		Player player2 = new Player();
		Scanner scan = new Scanner(System.in);
		GuessNumber guessNumber = new GuessNumber(player1, player2);

		while (newGame) {
			System.out.println("Enter name of first player: ");
			player1.setPlayerName(scan.nextLine());
			System.out.println("Enter name of second player: ");
			player2.setPlayerName(scan.nextLine());
			guessNumber.runGame();
			System.out.println("Do you want to continue? (y/n)");
			if (scan.nextLine().contentEquals("n")) newGame = false;
		}
	}
}