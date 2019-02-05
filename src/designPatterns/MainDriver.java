package designPatterns;

import java.util.Date;

public class MainDriver {
	public static void main(String[] args) {

		Singleton s2 = Singleton.Instance();
		s2.print();

		Thread th1 = new Thread() {
			{
				Singleton.Instance().print();
				System.out.println(new Date().toString() + Singleton.Instance());
			}
		};
		Thread th2 = new Thread() {
			{
				Singleton.Instance().print();
				System.out.println(new Date().toString() + Singleton.Instance());
			}
		};
		th1.start();
		th2.start();

	}
}
