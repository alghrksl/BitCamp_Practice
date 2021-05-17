package com.test;
public class WorkShop2_4 {
	public static void main(String[] args) {
		String[][] students = {
			{"A", "B", "A", "C", "C", "D", "E", "F", "A", "D"},	
			{"D", "B", "A", "B", "C", "A", "E", "F", "A", "D"}
		};
		String[] answer = {
			"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"	
		};
//		System.out.println(students.length);
		for(int i = 0; i < students.length; i++) {
			int count = 0;
			for(int j = 0; j < students[i].length; j++) {
//				System.out.print(students[i][j]);
				if(students[i][j] == answer[j]) {
					count++;
				}
			}
			System.out.println();
			System.out.printf("The Student[%d]'s Score is %d\n",
					i, count);
		}
	}
}
