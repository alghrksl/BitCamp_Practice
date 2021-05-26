package Arr;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Score {

	private static final long[][][] String = null;

	public static void main(String[] args) {

		String name;
		Scanner scanner = new Scanner(System.in);

		String sooup;
		String[][] student = new String[4][11];
		String math_score;
		String language_score;
		String english_score;

		for (int j = 1; j < student[0].length; j++) {
			student[0][0] = " 이름 : ";
			student[1][0] = " 국어 : ";
			student[2][0] = " 수학 : ";
			student[3][0] = " 영어 : ";

			System.out.print("사람 이름 >");
			sooup = scanner.nextLine();
			student[0][j] = sooup;

			for (int i = 1; i < student.length; i++) {

				System.out.print("점수 >");
				math_score = scanner.nextLine();
				student[i][j] = math_score; // 여기까지함

			}

		}

		for (int i = 0; i < 4; i++) {
			System.out.println(Arrays.toString(student[i]));
		}

	}

}
