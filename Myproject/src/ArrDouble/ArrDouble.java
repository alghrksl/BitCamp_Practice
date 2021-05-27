package ArrDouble;

public class ArrDouble {

	public static void main(String[] args) {

		String[][] arr2 = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };

		for (int i = 0; i < arr2.length; i++) {

			for (int j = 0; j < arr2[i].length; j++) {

				System.out.print(arr2[i][j] + " ");

			}

			System.out.println("");
		}
	}

}
