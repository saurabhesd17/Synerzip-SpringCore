package com.saurabh.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/saurabh/ref/refconfig.xml");
		Student s1 = (Student)context.getBean("student1");
		System.out.println(s1.getName());
		System.out.println(s1.getObj().getSubject());
		System.out.println(s1.getObj());
		System.out.println(s1);
		((ClassPathXmlApplicationContext)context).close();;
	}

}
