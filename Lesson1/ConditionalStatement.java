public class ConditionalStatement{
	public static void main (String[] args){
		int age = 23;
		float height = 1.54f; 
		boolean sexIsMale = false; // false - female, true - male;
		char firstChOfName = 'B';
		if (age > 20) {
			System.out.println("Age is greater then 20 yo");
		}

		if (sexIsMale) {
			System.out.println("Sex is male");
		}

		if (!sexIsMale) {
			System.out.println("Sex is female");
		}

		if (height < 1.8) {
			System.out.println("Height is lower than 1.8m");
		}else {
			System.out.println("Height is higher or equal 1.8m");
		}

		if (firstChOfName == 'M'){
			System.out.println("First character of name is \"M\"");
		}else if (firstChOfName == 'I'){
			System.out.println("Первая буква имени - \"I\"");
		}else {
			System.out.println("First character of name is \"" + firstChOfName + "\"");
		}
	}
}