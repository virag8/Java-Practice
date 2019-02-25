
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
		// TODO Auto-generated method stub
//		Test1 t1 = null;
//		System.out.println(t1.j);
//		System.out.println(t1.i);

		String[] strings = new String[3];
		strings[1] = "vv";
		System.out.println(strings[0]);

	}

	public static void print1() {

		try {
			int a = 1 / 0;
			System.out.println("Step1");
		} finally {
			// TODO: handle finally clause
			System.out.println("finally");
		}
		System.out.println("Step2");

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

class I11 extends C1 implements I1 {
	public static void main(String[] args) {
		I1 i1 = null;
		i1.print();
		System.out.println(I1.num);
		C1 c1 = new C11();
		C1 c2 = new C11();
		c1.num = 100;
		System.out.println(c2.num);

		// I1.num = 100;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}
}

interface I1 {
	int num = 10;

	void print();

	default void say() {

	}
}

abstract class C1 {
	int num = 20;

	abstract void print();
}

class C11 extends C1 {

	void print() {

	};

}
