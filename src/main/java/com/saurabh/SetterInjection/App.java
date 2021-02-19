package com.saurabh.SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * We are showing SetterInjection using Spring.
 * Also, we will use ClassPathXmlApplicationContext in this project.
 *
 */
public class App 
{
	private static ApplicationContext context;
    public static void main( String[] args )
    {
    	//ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	context = new ClassPathXmlApplicationContext("com/saurabh/SetterInjection/setterconfig.xml");
        Player player1 = (Player) context.getBean("player1");
        System.out.println(player1);
        
        Player player2 = (Player) context.getBean("player2");
        System.out.println(player2);
        
        Player player3 = (Player) context.getBean("player3");
        System.out.println(player3);
        
        //((ClassPathXmlApplicationContext) context).close();
    }
}
