package designPatterns;

public class Singleton1 implements Runnable {

	private static Singleton1 _singleton;
	private int i;
	private String s;

	private Singleton1() {
		System.out.println("private constr");
	}

	public static Singleton1 Instance() {
		System.out.println("ThreadName: " + Thread.currentThread().getName());
		System.out.println("ThreadID: " + Thread.currentThread().getId());
		if (_singleton == null) {
			synchronized (Singleton1.class) {
				if (_singleton == null) {
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					_singleton = new Singleton1();

				}

			}

		}
		return _singleton;
	}

	public void print() {
		System.out.println("print");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		_singleton.print();
	}

}

class Singleton2 {

	private static Singleton2 _singleton;
	private int i;
	private String s;

	private Singleton2() {
		System.out.println("private constr");
	}

	public synchronized static Singleton2 Instance() {
		if (_singleton == null) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			_singleton = new Singleton2();

		}
		return _singleton;
	}

	public void print() {
		System.out.println("print");
	}

}
