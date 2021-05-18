package com.test;

public class Sample10 {

	public static void main(String[] args) {
		Sample10 obj = new Sample10();
		Sample10.innerClass obj2 = obj.new innerClass();
		obj2.testMethod();

		Sample10.StaticClass.testMethod2();
	}

	private int a = 10;

	class innerClass {
		void testMethod() {
			System.out.println("test");
		}
	}

	static class StaticClass {
		static void testMethod2() {
			System.out.println("test2");
		}
	}
}
