package com.saurabh.Stereotype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/saurabh/Stereotype/stereoconfig.xml");
	Student student = context.getBean("student", Student.class);
	//System.out.println(student);
	System.out.println(student.hashCode());
	
	Student student2 = context.getBean("student", Student.class);
	System.out.println(student2.hashCode());
	context.close();
	}

}
