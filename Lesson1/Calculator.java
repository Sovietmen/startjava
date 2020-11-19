import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first integer number:");
		int num1 = scan.nextInt();
		System.out.println("Enter sign of operation (+, -, *, /, %, ^):");
		char operation = scan.next().charAt(0);
		System.out.println("Enter second integer number:");
		int num2 = scan.nextInt();
		long result = 0;
		
		switch (operation) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;
			case '^':
				result = num1;
				if (num2 == 0) {
					result = 1;
					break;
				}
				for (int i = 1; i < num2; i++){
					 result *= num1;
				}
				break;
			default:
				System.out.println("Wrong symbol");
		}
		System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
	}
}