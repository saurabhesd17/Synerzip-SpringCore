package com.saurabh.ConsInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/saurabh/ConsInjection/consconfig.xml");
		try {
			Person p1 = (Person) context.getBean("person1");
			System.out.println(p1);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			((ClassPathXmlApplicationContext)context).close();
		}

	}

}
