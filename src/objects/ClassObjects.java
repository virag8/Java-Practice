package objects;

public class ClassObjects {
	private int id;

	public ClassObjects(int id) {
		this.id = id;
	}

	public static void main(String[] args) {
		ClassObjects f1 = new ClassObjects(1);
		ClassObjects f2 = new ClassObjects(2);
		ClassObjects f3 = f1;
		System.out.println(f1.hashCode());
		System.out.println(f2.hashCode());
		System.out.println(f3.hashCode());

		System.out.println("f1 == f2: " + (f1 == f2));
		System.out.println("f1.equals(f2): " + f1.equals(f2));
		System.out.println("f1 == f3: " + (f1 == f3));
		System.out.println("f1.equals(f3)=" + f1.equals(f3));

	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		ClassObjects o = (ClassObjects) obj;
		return this.id == o.id;
	}

//        @Override
//        public int hashCode() {
//            System.out.println(super.hashCode());
//            return super.hashCode();
//        }

}
