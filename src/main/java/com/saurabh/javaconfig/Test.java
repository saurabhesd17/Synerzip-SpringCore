package com.saurabh.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = context.getBean("student2", Student.class);
		student.show();
		context.close();

	}

}
