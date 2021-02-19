package com.saurabh.StandAlone.Collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/saurabh/StandAlone/Collections/standconfig.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
		System.out.println(person.getFriends().getClass().getName());
		System.out.println(person.getFees().getClass().getName());
		System.out.println(person.getProp().getClass());
		context.close();
	}

}
