package com.test;

public class Sample12Important {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int[] arr = { 2, 1, 3, 4, 200, 300, 450, 123125412, 4050345 };
		int temp;
		boolean sorted = false;
		while (!sorted) {
			sorted = true;

			for (int inx = 0; inx < arr.length - 1; inx++) {

				if (arr[inx] > arr[inx + 1]) {
					temp = arr[inx];
					arr[inx] = arr[inx + 1];
					arr[inx + 1] = temp;
					sorted = false;

				}
			}
		}

		for (int a : arr) {
			System.out.println(a);
		}
	}
}
