package collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetExamples {
	public static void main(String[] args) {
		HashSet<String> s1 = new HashSet<String>();
		s1.add("EPAM");
		s1.add("Systems");
		s1.add("EPAM");
		s1.add("India");
//		for (String string : s1) {
//			System.out.println(string);
//		}
		Iterator<String> itr1 = s1.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		// Traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
