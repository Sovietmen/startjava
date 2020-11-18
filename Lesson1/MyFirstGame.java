import java.util.*;

public class MyFirstGame {
	public static void main(String[] args) {
		Random random = new Random();
		int secretNum = random.nextInt(101);
		int playerNum = 0;
		System.out.println("Guess the number from 0 to 100: ");
		Scanner scan = new Scanner(System.in);

		while (playerNum != secretNum) {
			playerNum = scan.nextInt();
			if (playerNum > secretNum) {
				System.out.println("No. Your number more than my. Try again.");
			} else if (playerNum < secretNum) {
				System.out.println("No. Your number less than my. Try again.");
			}
		}
		System.out.println("Yes!!! You win! I thought the number " + secretNum);
	}
}