package com.interfaceandinterface;

public class MainInterface implements FirstInterface{
	@Override
	public void secondInterfaceMethod() {
		System.out.println("secondInterfaceMethod");
	}
	@Override
	public void printMethod() {
		FirstInterface.super.printMethod();
		System.out.println("default printMethod");
	}
	public static void main(String[] args) {
		MainInterface interface1 = new MainInterface();
		interface1.secondInterfaceMethod();
		interface1.printMethod();
	}
}