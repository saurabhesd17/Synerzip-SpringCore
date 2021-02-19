package com.saurabh.ConsInjection;

public class Person {
	private int id;
	private String name;
	private Certificate certi;
	
	public Person(int id, String name, Certificate certi) {
		this.id = id;
		this.name = name;
		this.certi = certi;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Certificate getCerti() {
		return certi;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", certi=" + certi.getName() + "]";
	}
}
