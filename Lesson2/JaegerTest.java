import java.util.*;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaeger1 = new Jaeger("Gipsy Danger");
		jaeger1.setMark("Mark-3");
		jaeger1.setOrigin("United States of America");
		jaeger1.setParameters(79.25f, 1.980f, 8, 7, 6);

		Jaeger jaeger2 = new Jaeger("Cherno Alpha");
		jaeger2.setMark("Mark-1");
		jaeger2.setOrigin("Russia");
		jaeger2.setParameters(85.34f, 2.412f, 10, 3, 10);

		System.out.println("Type command: \"scan1\", \"scan2\", \"list\", \"status1\", \"status2\", \"move1\", \"move2\", \"drift1\", \"drift2\"");
		Scanner scan = new Scanner(System.in);
		String command = null;
		while (scan.hasNext()) {
			command = scan.nextLine();
			switch(command) {
				case "scan1":
					System.out.println("----------------------------------------");
					System.out.println(jaeger1.getModelName() + "Scan Kaiju..........");
					System.out.println(jaeger1.scanKaiju());
					break;
				case "scan2":
					System.out.println("----------------------------------------");
					System.out.println(jaeger2.getModelName() + "Scan Kaiju..........");
					System.out.println(jaeger2.scanKaiju());
					break;
				case "list":
					System.out.println("----------------------------------------");
					System.out.println("First jaeger: " + jaeger1.getModelName());
					System.out.println("Second jaeger: " + jaeger2.getModelName());
					break;
				case "exit":
					System.exit(0);
					break;
				case "status1":
					System.out.println("----------------------------------------");
					System.out.println("Status of " + jaeger1.getModelName());
					System.out.println("mark - " + jaeger1.getMark());
					System.out.println("Origin - " + jaeger1.getOrigin());
					System.out.println("Height - " + jaeger1.getHeight());
					System.out.println("Weight - " + jaeger1.getWeight());
					System.out.println("Speed - " + jaeger1.getSpeed());
					System.out.println("Strengh - " + jaeger1.getStrengh());
					System.out.println("Armor - " + jaeger1.getArmor());
					System.out.println("Drift status - " + jaeger1.getDriftStatus());
					break;
				case "status2":
					System.out.println("----------------------------------------");
					System.out.println("Status of " + jaeger2.getModelName());
					System.out.println("mark - " + jaeger2.getMark());
					System.out.println("Origin - " + jaeger2.getOrigin());
					System.out.println("Height - " + jaeger2.getHeight());
					System.out.println("Weight - " + jaeger2.getWeight());
					System.out.println("Speed - " + jaeger2.getSpeed());
					System.out.println("Strengh - " + jaeger2.getStrengh());
					System.out.println("Armor - " + jaeger2.getArmor());
					System.out.println("Drift status - " + jaeger2.getDriftStatus());
					break;
				case "move1":
					System.out.println("----------------------------------------");
					jaeger1.move();
					break;
				case "move2":
					System.out.println("----------------------------------------");
					jaeger2.move();
					break;
				case "drift1":
					System.out.println("----------------------------------------");
					if (jaeger1.getDriftStatus()) {
						jaeger1.driftOff();
					} else jaeger1.driftOn();
					break;
				case "drift2":
					System.out.println("----------------------------------------");
					if (jaeger2.getDriftStatus()) {
						jaeger2.driftOff();
					} else jaeger2.driftOn();
					break;
				default:
				System.out.println("----------------------------------------");
				System.out.println("Wrong command!!!");
				System.out.println("Type command: \"scan1\", \"scan2\", \"list\", \"status1\", \"status2\", \"move1\", \"move2\", \"drift1\", \"drift2\"");
				System.out.println("----------------------------------------");
				break;
			}
		}
	}
}