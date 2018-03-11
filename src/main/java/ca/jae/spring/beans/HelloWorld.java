package ca.jae.spring.beans;

public class HelloWorld {
	private String name;

	public String getName() {
		return name;
	}

	public HelloWorld() {
		
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void hello() {
		System.out.println("hello " + name);
	}

}
