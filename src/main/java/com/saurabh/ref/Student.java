package com.saurabh.ref;

public class Student {
	private String name;
	private Exam obj;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, Exam obj) {
		super();
		this.name = name;
		this.obj = obj;
	}

	public String getName() {
		return name;
	}

	public Exam getObj() {
		return obj;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setObj(Exam obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", obj=" + obj.getSubject() + "]";
	}
	
}
