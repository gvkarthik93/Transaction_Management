package com.app.transactionmanagement;

public class TestClass {
	public void testClass() {
		App app = new App();
		app.setMessage("HOLA");
		String msg = app.getMessage();
		System.out.println(msg);
	}
}
