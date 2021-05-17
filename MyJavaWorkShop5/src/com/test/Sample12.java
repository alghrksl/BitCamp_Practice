package com.test;

class Calculator2 {
	// µ¡¼À, »¬¼À, °ö¼À, ³ª´°¼À ¸Ş¼Òµå¸¦ ±¸ÇöÇÏ½Ã¿À.
	// add, subtract, multiply, divide
	int add(int a, int b) { return a + b; }
	int subtract(int a, int b) { return a - b; }
	int multiply(int a, int b) { return a * b; }
	int divide(int a, int b) { return a / b; }
}

public class Sample12 {
	public static void main(String[] args) {
		Calculator2 calc = new Calculator2();
		int d = calc.add(1, 2);
		System.out.println(d);
		
	}
}










// 257ÆäÀÌÁö 6-6 6-9 6-10 6-13
