package com.program;

public class TestInterface implements Showable{

	@Override
	public void print() {
		System.out.println("Printable Interface");	
	}
	@Override
	public void show() {
		System.out.println("ShowaleInterface");		
	}
	public static void main(String[] args) {
		TestInterface interface1= new TestInterface();
		interface1.print();
		interface1.show();
	}
}
