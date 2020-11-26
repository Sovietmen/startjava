import java.util.*;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		String answer;
		Scanner scan = new Scanner(System.in);
		answer = "y";
		while (!answer.contentEquals("n")) {
			if (answer.contentEquals("y")) {
				System.out.println("Enter first integer number:");
				calculator.setNum1(scan.nextInt());
				System.out.println("Enter sign of operation (+, -, *, /, %, ^):");
				calculator.setOperation(scan.next().charAt(0));
				System.out.println("Enter second integer number:");
				calculator.setNum2(scan.nextInt());
				System.out.println("Result = " + calculator.calculate());
			}
		System.out.println("Continue (y/n)?");
		answer = scan.next(); 
		}
	}
}