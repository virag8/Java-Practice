import java.util.regex.Pattern;

public class Test1 {

	public int i = 10;
	public static int j = 10;

	public Test1() {
		// TODO Auto-generated constructor stub
		System.out.println("Test1 - default");
	}

	static {
		System.out.println("static");
	}

	public final static void main(String[] args) {
		String regex = "\\W+";
		String input = "#@";
		String myStr = "EPAM";
		String myStr1 = "EPAM";
		String myStr2 = new String("EPAM");
		System.out.println(myStr);
		System.out.println(myStr1);
		System.out.println(myStr2);
		myStr = "system";

		System.out.println(myStr.hashCode());
		System.out.println(myStr1.hashCode());
		System.out.println(Pattern.matches(regex, input));

//		Test1 t1 = null;
//		System.out.println(t1.j);
//		System.out.println(t1.i);
	}

	public static void print1() {

		/**
		 * This is documentation comment
		 */
		int a = 10;
		int b = 5;
		int c = 20;
		// System.out.println(++a + ++a);
		System.out.println(a < b && a++ > c);// false && true = false
		System.out.println(a);// 10 because second condition is not checked
//		System.out.println(a < b & a++ < c);// false && true = false
//		System.out.println(a);// 11 because second condition is checked
	}

}

class B extends A {

	void print() {
		System.out.println(super.i);
		;
	}

	B() {
		// super(5);
		// TODO Auto-generated constructor stub
	}

}

abstract class A {
	int i;

	A() {

	}

	A(int i) {
		this.i = i;
	}
}
