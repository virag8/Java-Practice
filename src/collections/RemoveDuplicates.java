package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {

		String test = "This is a test string";
		String[] tokens = test.split("\\s");
		System.out.println(tokens.length);

		String[] names = { "abc", "edf", "fgh", "abc", "bcd", "abc", "abc", "cde", null, "0", "abc" };
		System.out.println("***Original ArrayList***");
		List<String> lstNames = Arrays.asList(names);
		for (String string : lstNames) {
			System.out.println(string);
		}

//		System.out.println("***TreeSet***");
//		Set<String> setTNames = new TreeSet<>();
//		setTNames.addAll(lstNames);
//		for (String string : setTNames) {
//			System.out.println(string);
//		}

		System.out.println("***HashSet***");
		Set<String> setNames = new HashSet<>();
		setNames.addAll(lstNames);
		for (String string : setNames) {
			System.out.println(string);
		}

		System.out.println("***LinkedHashSet***");
		Set<String> setLNames = new LinkedHashSet<>();
		setLNames.addAll(lstNames);
		setLNames.add("efg");
		setLNames.add("egf");
		setLNames.remove("abc");
		setLNames.add("bdc");
		setLNames.add("abc");
		for (String string : setLNames) {
			System.out.println(string);
		}

//		System.out.println("***LinkedHashSet***");
//		SortedSet<String> setSNames = new HashSet();
//		setLNames.addAll(lstNames);
//		for (String string : setLNames) {
//			System.out.println(string);
//		}
		System.out.println("*****");

	}
}
