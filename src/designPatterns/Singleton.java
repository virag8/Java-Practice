package designPatterns;

public class Singleton {

	private static Singleton _singleton;
	private int i;
	private String s;

	private Singleton() {
		System.out.println("private constr");
	}

	public static Singleton Instance() {
		if (_singleton == null) {
			synchronized (Singleton.class) {
				if (_singleton == null)
					_singleton = new Singleton();

			}

		}
		return _singleton;
	}

	public void print() {
		System.out.println("print");
	}

}
