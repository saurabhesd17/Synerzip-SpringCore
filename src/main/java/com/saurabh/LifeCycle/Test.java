package com.saurabh.LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/saurabh/LifeCycle/lifeconfig.xml");
		Life life = (Life)context.getBean("life");
		System.out.println(life);
		//register shut down hook method  destroys initialized context therefore it'll call destroy method.
		context.registerShutdownHook();
		
		System.out.println("----------------------");
		Earth earth = (Earth)context.getBean("earth");
		System.out.println(earth);
		
		System.out.println("-----------------------");
		Sun sun = (Sun)context.getBean("sun");
		System.out.println(sun);
		((ClassPathXmlApplicationContext)context).close();
	}

}
