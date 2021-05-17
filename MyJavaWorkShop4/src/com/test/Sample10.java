package com.test;

public class Sample10 {
	public static void main(String[] args) {
//		int[] arr;
//		arr = new int[3];	
//		int[] arr2 = new int[4];
//		arr2[0] = 10;
//		arr2[1] = 20;
//		arr2[2] = 100;
//		arr2[3] = 300;
//		//arr2[4] = 300;
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
//		int[] arr3 = {10,20,100,300};
//		for(int j = 0; j < arr3.length; j++) {
//			System.out.println(arr3[j]);
//		}
//		String[] names = new String[3];
//		names[0] = "이순신";
//		names[1] = "을지문덕";
//		names[2] = "세종대왕";
//		
//		for(int k = 0; k < names.length; k++) {
//			System.out.println(names[k]);
//		}
//		for(String name : names) {
//			System.out.println(name);
//		}
//		int[][] arr4 = new int[4][3];
//		arr4[0][0] = 10;
//		arr4[0][1] = 20;
//		arr4[0][2] = 30;
//		int[][] arr5 = {{1,2},{3,4}};		
//		int[][][] arr6 = {{{1,2},{3,4}}}; //1,2,2
		// 페이지 217 5-18 예제 
		
		int[][] arr5 = {{1,2},{3,4}};	
//		System.out.println(arr5.length);
		
		for(int i = 0; i < arr5.length; i++) {
			// arr5[0] = {1,2}
			// arr5[1] = {3,4}
			for(int j = 0; j < arr5[i].length; j++) {
				System.out.println(arr5[i][j]);
				System.out.println(i + ", " + j);
			}
		}		
		//arr5[0][0];
	}
}









