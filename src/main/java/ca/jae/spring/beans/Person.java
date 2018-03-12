package ca.jae.spring.beans;

public class Person {
	private int age;
	private String name;
	private Car car;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", car=" + car + "]";
	}
}
