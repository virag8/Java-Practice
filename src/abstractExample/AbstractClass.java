package abstractExample;

public class AbstractClass {
	public AbstractClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		A.speak();
		A a = new B();
		a.read();
		a.write();

		A b = new C();
		b.read();
	}

}

class C extends B {
	public void write() {
		System.out.println("write - C");
	}

	public void read() {
		// TODO Auto-generated method stub
		System.out.println("read - C");
	}

}

class B extends A {
	B() {
		super(2);
		System.out.println("B - constr");
	}

	public void write() {
		System.out.println("write - B");
	}

	public void read() {
		// TODO Auto-generated method stub
		System.out.println("read - B");
	}

}

abstract class A {
	A() {
		System.out.println("A constr");
	}

	A(int i) {
		System.out.println(i);
	}

	public abstract void write();

	// static abstract void listen();

	public void read() {
		System.out.println("read - A");
	}

	public static void speak() {
		System.out.println("speak - A");
	}

}
