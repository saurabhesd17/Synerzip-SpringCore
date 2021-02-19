package com.saurabh.javaconfig;

public class Student {
	
	private Exam exam;
	
	public Student(Exam exam) {
		this.exam = exam;
	}
	
	public void show() {
		System.out.println("Student");
		this.exam.show();
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}
}
