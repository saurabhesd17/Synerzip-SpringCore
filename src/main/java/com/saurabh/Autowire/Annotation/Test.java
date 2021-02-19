package com.saurabh.Autowire.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/saurabh/Autowire/Annotation/annotationconfig.xml");
		Employee emp1 = context.getBean("emp1", Employee.class);
		System.out.println(emp1);
		((ClassPathXmlApplicationContext)context).close();
	}
}
