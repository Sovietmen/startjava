public class Wolf {
	String nickname;
	String sex;
	int weight;
	short age;
	String color;

	Wolf(String s) {
		this.nickname = s;
	}

	void walk() {
		System.out.println("I'm wolk forward");
	}

	void sit() {
		System.out.println("I'm sitting");
	}

	void run() {
		System.out.println("I'm running");
	}

	void hunt() {
		System.out.println("I'm hunting");
	}

	String getNickname() {
		return nickname;
	}
}