package java8;

public class Interfaces implements I {
	public int i = 20;

	public static void main(String[] args) {

		System.out.println(new Interfaces().i);
	}
}

interface I {
	final static int i = 10;

}
