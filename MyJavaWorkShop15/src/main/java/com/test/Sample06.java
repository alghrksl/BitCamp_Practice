package com.test;

public class Sample06 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int[] arr2 = new int[] { 1, 2, 3, 4 };
		int[] arr3 = { 1, 2, 3, 4, 5 };

		
		for(int a = 0; a < arr3.length; a++ ) {
			System.out.println(arr3[a]);
			
		};
		
		String[] name = new String[3];
		name[0] = "이순신";
		name[1] = "강감찬";
		name[2] = "박혁거세";
		for(int i = 0; i < name.length; i++ ) {
			System.out.println(name[i]);
		}
		
		for(String s: name) {
			System.out.println(s);
		}
	}

}
