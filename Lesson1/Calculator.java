import java.util.*;

public class Calculator{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		System.out.println("Enter first integer number:");
		num1 = scan.nextInt();
		System.out.println("Enter second integer number:");
		num2 = scan.nextInt();
		System.out.println("Enter sign of operation (+, -, *, /, %, ^):");
		long result = 0;
		char operator = '\0';
		operator = scan.next().charAt(0);
		switch (operator) {
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
				for (int i = 1; i < num2; i++){
					 result *= num1;
				}
				break;
			default:
				System.out.println("Wrong symbol");
		}
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	}
}