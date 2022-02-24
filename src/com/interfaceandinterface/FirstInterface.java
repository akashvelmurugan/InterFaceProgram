package com.interfaceandinterface;

import com.interfaceprogram.Printable;

public interface FirstInterface extends SecondInterface,Printable{
	@Override
	default void printMethod() {
		System.out.println("default interface FirstInterface");
	}
	@Override
	void secondInterfaceMethod();
}
