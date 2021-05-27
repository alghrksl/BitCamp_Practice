// 3번-----------------------------------------------------------

package ArrDouble;

public class ArrDouble {

	public static void main(String[] args) {

		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < arr2.length; i++) {

			for (int j = 0; j < arr2[i].length; j++) {

				System.out.print(arr2[i][j] + " ");

			}
			System.out.println(" ");
		}
		System.out.println(" ");
		for (int i = arr2.length - 1; i > 0; i--) {
			int[] temp = arr2[i];
			arr2[i] = arr2[i - 1];
			arr2[i - 1] = temp;

		}

		for (int i = 0; i < arr2.length; i++) {

			for (int j = 0; j < arr2[i].length; j++) {

				System.out.print(arr2[i][j] + " ");

			}
			System.out.println(" ");
		}

	}

}
