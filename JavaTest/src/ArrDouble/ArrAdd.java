// 2번-----------------------------------------------------------

package ArrDouble;

import java.util.Scanner;

public class ArrAdd {

	public static void addOneDArr(int[][] arr, int add) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] += add;
				System.out.println(arr[i][j]);
			}
		}

	}

	public static void main(String[] args) {

		ArrAdd arradd = new ArrAdd();
		int[][] arr1 = new int[2][2];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.println("숫자 입력2 >");
				Scanner scanner = new Scanner(System.in);
				int a = scanner.nextInt();
				arr1[i][j] = a;
			}
		}

		arradd.addOneDArr(arr1, 2);
	}

}
