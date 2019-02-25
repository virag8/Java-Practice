package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
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

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101, " ajay");
		ht.put(101, "Vijay");
		ht.put(102, "Ravi");
		ht.put(103, "Ravi");
		ht.put(103, "Ravi");
		// ht.put(103, null);
		System.out.println("-------------Hash table--------------");
		for (Map.Entry m : ht.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// ----------------hashmap--------------------------------
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Amit");
		hm.put(104, "Amit"); // hash map allows duplicate values
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		hm.put(null, null);
		System.out.println("-----------Hash map-----------");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
