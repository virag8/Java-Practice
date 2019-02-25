package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetExamples {
	public static void main(String[] args) {
		HashSet<Object> hsA = new HashSet<Object>();
		A a1 = new A(1);
		A a2 = new A(1);
		A a3 = a1;

		hsA.add(a1);
		hsA.add(a2);
		hsA.add(a3);
		hsA.add("EPAM");
		hsA.add("EPAM");
		hsA.add(new String("EPAM1"));
		for (Object a : hsA) {
			System.out.println(a);
		}
	}

	private void checkOrder() {
		TreeSet<String> s1 = new TreeSet();
		s1.add("EPAM");
		s1.add("Systems");
		s1.add("EPAM");
		s1.add("India");
		s1.add("ABC");
		s1.remove("EPAM");
		s1.add("BCD");
		s1.add("EPAM");
		for (String string : s1) {
			System.out.print(string + " ");
		}
		System.out.print("\n");
		Iterator<String> itr1 = s1.iterator();
		while (itr1.hasNext()) {
			System.out.print(itr1.next() + " ");
		}
	}
}

class A {
	int i;

	A(int i) {
		this.i = i;
	}
}
