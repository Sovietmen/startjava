

public class Calculator {
	private int num1;
	private int num2;
	private char operationSign;
	
	Calculator() {

	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void setOperation(char operationSign) {
		this.operationSign = operationSign;
	}

	
	public float calculate() {
		float result = 0;
		switch (operationSign) {
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
	return result;
	}
}