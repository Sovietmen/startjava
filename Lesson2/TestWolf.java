public class TestWolf {
	public static void main(String[] args) {
		Wolf wolf = new Wolf ("Tush");
		wolf.age = 3;
		wolf.color = "black";
		wolf.sex = "male";
		wolf.weight = 10;

		System.out.println("Wolf nickname is "+wolf.getNickname());
		System.out.println("Wolf age is "+wolf.age);
		System.out.println("Wolf sex is "+wolf.sex);
		System.out.println("Wolf color is "+wolf.color);
		System.out.println("Wolf weight is "+wolf.weight);

		wolf.walk();
		wolf.sit();
		wolf.run();
		wolf.hunt();
	}
}