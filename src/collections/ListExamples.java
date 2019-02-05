package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExamples {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();

		strList.add("EPAM");
		strList.add("EPAM");
		strList.add("Systems");
		strList.add("India");
		strList.remove(0);
		Collections.sort(strList);
		for (int index = 0; index < strList.size(); index++) {
			System.out.println(strList.get(index));
			// strList.add("element");
		}
		for (Iterator<String> iterator = strList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			iterator.hashCode();
			// strList.add("element");
		}
	}
}
