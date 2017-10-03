package com.app.transactionmanagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// Creates application context
		// Creates and initializes all the beans in the configuration files
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig/*.xml");
		App app = (App) context.getBean("app");

		System.out.println(app.message);
	}
}
