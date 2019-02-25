package ocjp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Vehicle {
	int i = 0;

	public Vehicle(int i) {
		// TODO Auto-generated constructor stub
		this.i = i;
	}

	public void printSound() {
		System.out.print("vehicle");
	}
}

public class Test1 {
	public static void main(String[] args) {
		String s1 = new String("name");
		String s2 = new String("name");
		String s3 = s2;
		String s4 = new String("name1");

		Vehicle v1 = new Vehicle(2);
		Vehicle v2 = new Vehicle(2);
		Vehicle v3 = v2;
		Vehicle v4 = new Vehicle(3);

		Set<Object> hs1 = new HashSet();
		hs1.add(s1);
		hs1.add(s2);
		hs1.add(s3);
		hs1.add(s4);
		hs1.add(v1);
		hs1.add(v2);
		hs1.add(v3);
		hs1.add(v4);

		HashMap<Object, Integer> hm1 = new HashMap();
		hm1.put(s1, 1);
		hm1.put(s2, 1);
		hm1.put(s3, 1);
		hm1.put(s4, 1);
		hm1.put(v1, 1);
		hm1.put(v2, 1);
		hm1.put(v3, 1);
		hm1.put(v4, 1);

		Set<Object> so = hm1.keySet();
		for (Object object : so) {
			System.out.println(object);
		}
	}
}