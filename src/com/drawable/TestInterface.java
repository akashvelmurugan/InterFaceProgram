package com.drawable;

interface Dravable{
	void drow();
}
class Circle implements Dravable{
	@Override
	public void drow() {
System.out.println("Drove In Circle ..........");	
	}
}
class Rectangle implements Dravable{
	@Override
	public void drow() {
		System.out.println("Drow In Rectangle ...............");
	}	
}
public class TestInterface extends Circle {
	public static void main(String[] args) {
		TestInterface interface1= new TestInterface();
		interface1.drow();
	}
}
