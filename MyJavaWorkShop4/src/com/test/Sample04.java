package com.test;

public class Sample04 {
	// 페이지 162
	// 페이지 163 4-17
	public static void main(String[] args) {
		for(int i = 1; i < 6; i++) {
//			for(int j = 1; j < 11; j++) {
//				System.out.print("*");
//			}
			for(int j = 1; j < i+1; j++) {
				// i = 1, j = 1..5
				// i = 2, j = 1..5
				// i = 3, j = 1..5
				// i = 4, j = 1..5
				// i = 5, j = 1..5
				//System.out.print("*");
				//System.out.println(i + ", " + j);
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


