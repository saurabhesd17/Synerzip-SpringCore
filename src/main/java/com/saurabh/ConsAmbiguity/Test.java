package com.saurabh.ConsAmbiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/saurabh/ConsAmbiguity/consambiguityconfig.xml");
		Addition add = (Addition)context.getBean("add");
		add.sum();
		Addition add1 = (Addition)context.getBean("add1");
		add1.sum();
		((ClassPathXmlApplicationContext)context).close();
	}

}
