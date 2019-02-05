package spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {

	private String model;
	private String make;
	private String price;
	private RTO rto;

	@Autowired
	public Car(String price) {

		this.price = price;
		// this.rto = rto;
	}

	public RTO getRto() {
		return rto;
	}

	public void setRto(RTO rto) {
		this.rto = rto;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("car() - default constr");
	}

	public String toString() {
		return this.model + ": " + this.make + " : " + this.price + ": " + this.rto.getRegistrationNumber();
	}
}
