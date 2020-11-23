import java.util.*;

public class GuessNumberTest {
	public static void main(String[] args) {
		Player player1 = new Player("Player1");
		Player player2 = new Player("Player2");
		Scanner scan = new Scanner(System.in);
		GuessNumber guessNumber = new GuessNumber(player1, player2);
		guessNumber.runGame();
		String answer;
		while (true) {
			System.out.println("Do you want to continue? (y/n)");
			answer = scan.next();
			if (answer.contentEquals("y")) {
				System.out.println("Enter name of first player: ");
				player1.setPlayerName(scan.next());
				System.out.println("Enter name of second player: ");
				player2.setPlayerName(scan.next());
				guessNumber.runGame();
			} else if (answer.contentEquals("n")) {
				break;
			}
		}
	}
}