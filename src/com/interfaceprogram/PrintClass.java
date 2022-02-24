package com.interfaceprogram;

public class PrintClass implements Printable{

	@Override
	public void printMethod() {
		System.out.println("PrintableInterface");
	}
	public static void main(String[] args) {
		PrintClass printClassref = new PrintClass();
		printClassref.printMethod();
	}
}

