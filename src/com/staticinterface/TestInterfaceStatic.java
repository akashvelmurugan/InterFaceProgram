package com.staticinterface;

public class TestInterfaceStatic {
public static void main(String[] args) {
Drwable drwable=new Rectangle();
drwable.draw();
System.out.println(Drwable.cube(5));
System.out.println(Drwable.areaOfRectangle(5, 10));
}
}
