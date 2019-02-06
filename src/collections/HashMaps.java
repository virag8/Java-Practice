package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMaps {
	public static void main(String[] args) {
		HashMap<String, Integer> map1 = new HashMap<>();

		Set<Entry<String, Integer>> p = map1.entrySet();

		map1.put("abc", 1);
		map1.put("def", 2);

		for (Iterator iterator = p.iterator(); iterator.hasNext();) {
			Entry<String, Integer> entry = (Entry<String, Integer>) iterator.next();
			System.out.println(entry.getKey() + ":" + entry.getValue() + ":" + entry.hashCode());

		}

	}
}
