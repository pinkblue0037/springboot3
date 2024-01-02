package com.boot3.learnspringgramework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		try(var context =
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean(Person.class));
			System.out.println(context.getBean(Address.class));
		};
	}
}
