package com.test;

class MyC {
	public int a;
}

public class Sample06 {

	static void testMethod(MyC m) {
		m.a = 300;
	}
	
	static int testMethod2(int a) {
		a = 100;
		
		return a;
	}

	public static void main(String[] args) {

		MyC m = new MyC();
		m.a = 10;
		System.out.println(m.a);
		testMethod(m);
		System.out.println(m.a);
		int a = 10;
		System.out.println(a);
		testMethod2(a);
		System.out.println(a);
		
		
		
		
	}

}
