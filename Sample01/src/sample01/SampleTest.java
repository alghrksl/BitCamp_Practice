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

			System.out.printf("Computer Science ������ �Է��ϼ��� : ");
			float CsScore = getUserInput();
			System.out.printf("Java Programming ������ �Է��ϼ��� : ");
			float JpScore = getUserInput();
			System.out.printf("���м��� ������ �Է��ϼ��� : ");
			float MScore = getUserInput();
			System.out.printf("������� ���� ������ �Է��ϼ��� : ");
			float OpScore = getUserInput();
			System.out.printf("������ ������ �Է��ϼ��� : ");
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
					System.out.printf("%d��° ���� �߸� �ԷµǾ����ϴ�.", i);
					return;
				}

			}

			if (evg >= 0) {

				System.out.println("������" + evg + "�� �Դϴ�.");

				if (evg >= 3.7) {
					System.out.println("���б� ����� �Դϴ�.");

					for (int i = 0; i <= 4; i++) {

						if (num3[i] < 2.5) {
							System.out.println("�������� ���� ���б� ������ �Ұ����մϴ�.");

						}

					}

				}

			} else if (evg < 3.7) {
				System.out.println("");

			}
			;

			System.out.println("### 1. ���� ###");
			System.out.println("### 2. ��� ###");

			Scanner scanner2 = new Scanner(System.in);
			int input2 = scanner2.nextInt();

			switch (input2) {
			case 1: {
				System.out.println("����");
				return;
			}
			case 2: {

			}

			}

		}
	}

}
