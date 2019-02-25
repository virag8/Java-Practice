package collections;

import java.util.ArrayList;
import java.util.List;

public class ArraylistImplementation {
	public static void main(String[] args) {

		List<String> gh = new ArrayList<>();
		IArrayListLogic a = new ArrayListLogic();
		System.out.println(a.count());
		a.add("EPAM");
		a.add("Systems");
		System.out.println(a.count());
		a.remove("Systems");
		System.out.println(a.count());
		a.clear();
		System.out.println(a.count());
	}
}

class ArrayListLogic implements IArrayListLogic {
	String[] items = new String[] {};

	public ArrayListLogic() {
		// TODO Auto-generated constructor stub
		items = new String[] {};

	}

	@Override
	public void add(String item) {
		// TODO Auto-generated method stub
		String[] items2 = new String[items.length + 1];
		System.arraycopy(items, 0, items2, 0, items.length);
		items2[items.length] = item;
		items = items2;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		items = new String[] {};
	}

	@Override
	public Boolean remove(String item) {
		String[] items2 = new String[items.length - 1];
		int j = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i].equals(item))
				continue;

			if (i == items.length - 1)
				return false;

			items2[j++] = items[i];
		}
		items = items2;
		return true;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return items.length;
	}

}

interface IArrayListLogic {
	void add(String item);

	void clear();

	Boolean remove(String item);

	int count();

}
