package com.test2;
class Test extends Exception{
	Test(String msg){
		super(msg);
	}
}
public class Sample06 {
	public static void main(String[] args) {
		int a = 10;
		try {		
			if (a == 0) {
				throw new Test("오류에요.");
			}
		} catch(Test e) { // Test e = new Test();
			System.out.println("Test");
			System.out.println(e.getMessage());
		}
		System.out.println(a);
	}
}
