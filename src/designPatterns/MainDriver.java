package designPatterns;

public class MainDriver {
	public static void main(String[] args) {

		IItem v = null;

		Singleton1 s2 = Singleton1.Instance();
		s2.print();

		Thread th1 = new Thread(Singleton1.Instance()) {
			{
//				Singleton1.Instance().print();
//				System.out.println(new Date().toString() + Singleton1.Instance());
			}
		};
		Thread th2 = new Thread(Singleton1.Instance()) {
			{
//				Singleton1.Instance().print();
//				System.out.println(new Date().toString() + Singleton1.Instance());
			}
		};
		th1.start();
		th2.start();

	}
}
