public class Person {
	
	String sex = "male";
	String name = "Mike";
	int height = 174;
	float weight = 74.5f;
	short age = 22;
	short speed = 0;

	void walk() {
		speed = 10;
	}

	void sit() {
		speed = 0;
		height = 70;
	}

	void run() {
		speed = 20;
		height = 174;
	}

	String talk() {
		System.out.println("I need your bike and clothe!");
	}

	void studyJava() {

	}
}