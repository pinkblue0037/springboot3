package com.boot3.learnspringgramework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "mina";
	}
	
	@Bean
	public int age() {
		return 30;
	}
	
	@Bean
	@Primary
	public Person person() {
		return new Person("zhyo", 25, new Address("Main Street", "SeoulUni St"));
	}
	
	@Bean
	public Person person2() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Address address() {
		return new Address("Seoul", "happydong");
	}
}
