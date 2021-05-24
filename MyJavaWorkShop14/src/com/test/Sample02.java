package com.test;

interface class ICalculator {
	public int add(int x, int y);
}

public class Sample02 {

	public static void main(String[] args) {
		ICalculator calc = new ICalculator() {
			public int add(int x, int y) {

				return x + y;
			}
		};

		int c = calc.add(5, 5);
		System.out.println(c);

		ICalculator calc2 = (x, y) -> {
			return x + y;
		};
		int d = calc2.add(30, 100);
	}

}
