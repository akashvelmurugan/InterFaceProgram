package com.staticinterface;

public interface Drwable {
	void draw();

	static int cube(int a) {
		return a*a*a;	 
	}
	static int areaOfRectangle(int l,int b) {
	return l*b;
	}
	// static void draw();
}
