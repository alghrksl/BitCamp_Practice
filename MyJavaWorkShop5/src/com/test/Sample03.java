package com.test;

class MyClass {
	int myVar1;
	static int myVar2;
}
public class Sample03 {
	static int myVar3;
	public static void main(String[] args) {
//		MyClass m = new MyClass();
		MyClass.myVar2 = 20;
		System.out.println(MyClass.myVar2);
		//Sample03.myVar3 = 10;
		myVar3 = 20;
	}
}
