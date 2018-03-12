package ca.jae.spring.autowire;

import ca.jae.spring.autowire.Car;
import ca.jae.spring.autowire.Address;

public class Person {
	private String name;
	private Address address;
	private Car car;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Car getCar() {
		return car;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", car=" + car + "]";
	}
	public void setCar(Car car) {
		this.car = car;
	}

}
