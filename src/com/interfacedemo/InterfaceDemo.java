package com.interfacedemo;

import java.awt.CardLayout;
interface Ridable {
	void ride();
}
class Car implements Ridable {
	public void ride() {
		System.out.println("You Are Drive Car");
	}
}
class Bike implements  Ridable{
	public void ride() {
		System.out.println("You Are Drive Bike");
	}
}
class mechanic {
	void check(Ridable c){
		System.out.println("Checking");
		c.ride();
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		mechanic mechanic= new mechanic();
		Car c= new Car();
		mechanic.check(c);
		Bike bike = new Bike();
		mechanic.check(bike);
	}
}
