package com.test;

class MyData {
	private Object a;

	MyData(Object a) {
		this.a = a;
	}

	public Object getA() {
		return this.a;
	}
}

public class Sample14 {

	public static void main(String[] args) {
		MyData m = new MyData(11);
		Object o = m.getA();
		int a = (int) o;
		System.out.println(o);

		MyData m1 = new MyData(new String("ÀÌ¼ø½Å"));
		Object o1 = m1.getA();
		String s = (String) o1;
		System.out.println(o1);
		
		
		
		
	}

}
