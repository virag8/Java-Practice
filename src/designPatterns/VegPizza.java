package designPatterns;

public abstract class VegPizza extends Pizza {
	@Override
	public abstract float price();

	@Override
	public abstract String name();

	@Override
	public abstract String size();
}// End of the abstract class VegPizza.

class CheezePizza extends VegPizza {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String size() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float type() {
		// TODO Auto-generated method stub
		return 0;
	}

}