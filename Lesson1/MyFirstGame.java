import java.util.*;

public class MyFirstGame {
	public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt(101);
		int playerNum = 0;
		System.out.println("Guess the number from 0 to 100: ");
		Scanner scan = new Scanner(System.in);
		while (playerNum != number) {
			playerNum = scan.nextInt();
			if (playerNum > number) {
				System.out.println("No. Your number more than my. Try again.");
			}else if (playerNum < number) {
				System.out.println("No. Your number less than my. Try again.");
			}
		}
		if (playerNum == number) {
			System.out.println("Yes!!! You win! I thought the number" + number);
		}

	}
}