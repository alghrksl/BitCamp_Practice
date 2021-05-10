package sample0507;

public class Sample07 {

	public static void main(String[] args) {

		int a = 10;
		int b[] = { 1, 2, 3, 4, 5 };

		for (int j : b) {
			System.out.println(j);

		}

		int k = 0;
		int sum = 0;
		while (k <= 10) {
			sum++;
			k = sum;

			System.out.println(k);

		}
	}

}
