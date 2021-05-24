package com.test;

public class Sample04 {

	public static void main(String[] args) {
		int a = 0;
		a++;
		int b = a;
		System.out.println(b);

		int a1 = 10;
		int b1 = 20;
		if ((a1 > 20) && (b1 < 10)) { // 둘중 하나라도
			System.out.println("a1은 20 보다 크고 b1은 10보다 작습니다.");
		} else {
			System.out.println("a1은 20보다 크고 b1은 10보다 작지 않습니다");
		}
	}

}
