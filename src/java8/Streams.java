package java8;

import java.util.ArrayList;
import java.util.List;

public class Streams {
	static List<Product> productsList = new ArrayList<Product>();
	int i = 10;
	static {
		// TODO Auto-generated constructor stub
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
	}

	public static void main(String[] args) {
		// Adding Products
		// productsList.stream().filter(x -> x.price == 28000).forEach(product ->
		// System.out.println(product.name));
		productsList.forEach(x -> System.out.println(x.name));
	}
}

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
