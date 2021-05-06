package sample01;

import java.util.Iterator;
import java.util.Scanner;

public class SampleTest {

	public static float getUserInput() {

		Scanner scanner = new Scanner(System.in);
		float input = scanner.nextFloat();

		return input;

	}

	

	public static void main(String[] args) {

		while (true) {

			System.out.printf("Computer Science 성적을 입력하세요 : ");
			float CsScore = getUserInput();
			System.out.printf("Java Programming 성적을 입력하세요 : ");
			float JpScore = getUserInput();
			System.out.printf("공학수학 성적을 입력하세요 : ");
			float MScore = getUserInput();
			System.out.printf("오페라의 이해 성적을 입력하세요 : ");
			float OpScore = getUserInput();
			System.out.printf("배드민턴 성적을 입력하세요 : ");
			float BdScore = getUserInput();

			float evg = (CsScore + JpScore + MScore + OpScore + BdScore) / 5;

			float[] num3 = new float[5];
			num3[0] = CsScore;
			num3[1] = JpScore;
			num3[2] = MScore;
			num3[3] = OpScore;
			num3[4] = BdScore;

			for (int i = 0; i <= 5; i++) {

				if (num3[i] < 0 || num3[i] > 4.5) {
					System.out.printf("%d번째 값이 잘못 입력되었습니다.", i);
					return;
				}

			}

			if (evg >= 0) {

				System.out.println("평점은" + evg + "점 입니다.");

				if (evg >= 3.7) {
					System.out.println("장학금 대상자 입니다.");

					for (int i = 0; i <= 4; i++) {

						if (num3[i] < 2.5) {
							System.out.println("과락으로 인한 장학금 수령이 불가능합니다.");

						}

					}

				}

			} else if (evg < 3.7) {
				System.out.println("");

			}
			;

			System.out.println("### 1. 종료 ###");
			System.out.println("### 2. 계속 ###");

			Scanner scanner2 = new Scanner(System.in);
			int input2 = scanner2.nextInt();

			switch (input2) {
			case 1: {
				System.out.println("종료");
				return;
			}
			case 2: {

			}

			}

		}
	}

}
