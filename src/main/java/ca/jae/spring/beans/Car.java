package ca.jae.spring.beans;



public class Car {
	private String brand;

	private int price;

	public String getName() {
		return brand;
	}

	public void setbrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Car(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public Car() {
		super();
	}
	

}
