package com.justinchristofoli.CardGameServer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		@SuppressWarnings({ "unused", "resource" })
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");
	}
}
