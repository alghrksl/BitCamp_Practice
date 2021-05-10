package sample01;

import java.util.Iterator;

public class Samplearr {

	public static void main(String[] args) {

		String[][] student = { { "A", "B", "A", "C", "C", "D", "E", "F", "A", "D" },
				{ "D", "B", "A", "B", "C", "A", "E", "F", "A", "D" },
				{ "E", "D", "D", "A", "C", "B", "E", "E", "A", "D" },
				{ "E", "D", "D", "A", "C", "B", "E", "E", "A", "D" },
				{ "A", "B", "D", "C", "C", "D", "E", "E", "A", "D" }, };

		String[] answer = { "D", "B", "D", "C", "C", "D", "A", "E", "A", "D" };

		int count = 0;

		for (int i = 0; i < student.length; i++) {
			
			for (int j = 0; j < student[i].length; j++) {
				System.out.print(student[i][j]);

				if (student[i][j] == answer[j]) { /// 배열 비교

					count++; ///////////// 카운팅

				}

			}

			System.out.println();
			System.out.printf("채점 결과 : %d", count);
			System.out.println();
		}

	}

}
