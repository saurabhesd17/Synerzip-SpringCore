package com.saurabh.SpEL;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.expression.Expression;
//import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/saurabh/SpEL/spelconfig.xml");
		Demo demo1 = context.getBean("demo", Demo.class);
		System.out.println(demo1);
		System.out.println(demo1.hashCode());
		context.close();
		
//		SpelExpressionParser parse = new SpelExpressionParser();
//		Expression ex = parse.parseExpression("20+33");
//		System.out.println(ex.getValue());
	}

}
