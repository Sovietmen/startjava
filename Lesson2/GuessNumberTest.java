import java.util.*;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name of first player: ");
		Player player1 = new Player(scan.next());
		System.out.println("Enter name of second player: ");
		Player player2 = new Player(scan.next());
		GuessNumber guessNumber = new GuessNumber(player1, player2);
		String answer = "y";
		while (true) {
			if (answer.contentEquals("y")) {
				guessNumber.runGame();
			} else if (answer.contentEquals("n")) {
				break;
			}
			System.out.println("Do you want to continue? (y/n)");
			answer = scan.next();
		}
	}
}