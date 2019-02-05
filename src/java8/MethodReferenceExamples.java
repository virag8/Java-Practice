package java8;

public class MethodReferenceExamples {

	public static void sayable() {
		System.out.println("sayable");
	}

	public static int tellable(int i) {
		System.out.println("tellable");
		return i;
	}

	public static void main(String[] args) {
		M m = MethodReferenceExamples::sayable;
		m.say();
		N n = MethodReferenceExamples::tellable;
		System.out.println(n.tell(10));
	}
}

interface M {
	void say();

}

interface N {
	int tell(int i);

}
