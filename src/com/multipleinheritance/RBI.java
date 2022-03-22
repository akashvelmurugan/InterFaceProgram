package com.multipleinheritance;

public class RBI implements Sbi,CbiBank{
	
	@Override
	public void fixed() {
		System.out.println("6%");
	}
	@Override
	public void savings() {
		System.out.println("7%");
	}
	@Override
	public void debied() {
		System.out.println("8%");
	
	}
	public static void main(String[] args) {
	RBI rbi= new RBI();
	rbi.fixed();
	rbi.savings();
	rbi.debied();
	}
}
