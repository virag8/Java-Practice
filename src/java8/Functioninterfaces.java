package java8;

public class Functioninterfaces {

	public static void main(String[] args) {

		sayit f2 = () -> System.out.println("Byee");

		tellit t2 = (String m) -> {
			System.out.println(m);
		};

		speakit s2 = () -> {
			return 1;
		};

	}

}

interface doit {
	static void say(String msg) {
		System.out.println(msg);
	};
}

interface sayit {
	void tell();
}

interface tellit {
	void tell(String msg);
}

interface speakit {
	int tell();
}
