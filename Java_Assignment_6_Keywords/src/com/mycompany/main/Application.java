package com.mycompany.main;

public class Application {

	public static void main (String[] args) {
		
		StaticClass StaticClass = new StaticClass();
		StaticClass.math(34.3, 20);
		
		FinalClass FinalClass = new FinalClass();
		FinalClass.printConstant();
		
		ConcreteClass ConcreteClass = new ConcreteClass();
		ConcreteClass.run();
	}
	
}
