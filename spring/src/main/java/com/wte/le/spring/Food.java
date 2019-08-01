package com.wte.le.spring;

public class Food {
	
	public Food() {
		super();
	}

	public Food(String name) {
		super();
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + "]";
	}
	
}
