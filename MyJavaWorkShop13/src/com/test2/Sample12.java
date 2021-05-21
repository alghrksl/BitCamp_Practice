package com.test2;

public class Sample12 {
	enum Menu {
		pizza,
		spagatti,
		raymeon
	}
	public static void main(String[] args) {
		System.out.println(Menu.pizza);
		
		for(Menu m : Menu.values()) {
			System.out.println(m);
			System.out.println(m.ordinal());
			System.out.println(m);
		}
	}

}
