package com.test2;

class A {
	void aMethod() { System.out.println("aMethod in A"); }
	@Deprecated
	void bMethod() { System.out.println("bMethod in B"); }
}

public class Sample14 {
	public static void main(String[] args) {
		A a = new A();
		a.aMethod();
		a.bMethod();
	}
}
