package com.test2;
enum Season {
	winter(10), summer(20);
	private int a;
	private Season(int a){
		this.a = a;
	}
	public int getValue() {
		return this.a;
	}
}
public class Sample13 {
	public static void main(String[] args) {
		for(Season s : Season.values()) {
			System.out.println(s + "," + s.getValue());
		}
		for(MyMenu s2 : MyMenu.values()) {
			System.out.println(s2 + ", " + s2.getA());
		}
	}
}
