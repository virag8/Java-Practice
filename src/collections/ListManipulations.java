package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListManipulations {
	/// static Integer in = new Integer("virag");
	static int i;

	public static void main(String[] args) {
		p();
	}

	public static void p() {
		String[] arr1 = { "virag", "VIRAG", "EPAM", "TechM", "VARIAN" };
		String[] arr2 = { "AFOUR", "kumar", "PB", "NOIDA" };
		Integer[] arr3 = { 45, 32, 42, 67, 10 };

		List<String> arrList1 = Arrays.asList(arr1);
		List<String> arrList2 = Arrays.asList(arr2);
		List<Integer> arrList3 = Arrays.asList(arr3);
		Collections.sort(arrList3);
		for (Integer is : arrList3) {
			System.out.println(is);
		}
		comp c = new comp();

		arrList1.sort(c);

		arrList1.addAll(arrList2);

		for (String string : arrList1) {
			System.out.println(string);
		}
	}
}

class comp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

}
