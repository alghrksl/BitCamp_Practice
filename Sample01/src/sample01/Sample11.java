package sample01;

import java.util.Scanner;

public class Sample11 {

	public static class Calculator2

	{
		int add(int a, int b) {
			return a + b;
		}

		int subtract(int a, int b) {
			return a - b;
		}

		int multiply(int a, int b) {
			return a * b;
		}

		int divide(int a, int b) {
			return a / b;
		}

	}
	
	public static int getUserInput() {

		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		return input;

	}

	public static void main(String[] args) throws InterruptedException {
		while (true) {

			Calculator2 calc = new Calculator2();

			int num2, num3 = 0;

			System.out.println("##################");
			System.out.println("# 1. 덧셈          ");
			System.out.println("# 2. 뺄셈          ");
			System.out.println("# 3. 곱셈          ");
			System.out.println("# 4. 나눗셈         ");
			System.out.println("# 5. 종료         ");
			
			System.out.println("##################");

			System.out.print("메뉴를 선택해주세요. >> ");
			int num = getUserInput();

			switch (num) {
			case 1: {
				System.out.print("첫번째 숫자를 입력해주세요 >> ");
				num2 = getUserInput();
				System.out.print("두번째 숫자를 입력해주세요 >> ");
				num3 = getUserInput();
				int answer = calc.add(num2, num3);
				System.out.println("정답 >> " + answer);
				break;
			}
			case 2: {
				System.out.print("첫번째 숫자를 입력해주세요 >> ");
				num2 = getUserInput();
				System.out.print("두번째 숫자를 입력해주세요 >> ");
				num3 = getUserInput();
				int answer = calc.subtract(num2, num3);
				System.out.println("정답 >> " + answer);
				Thread.sleep(answer);
				break;
			}
			case 3: {
				System.out.print("첫번째 숫자를 입력해주세요 >> ");
				num2 = getUserInput();
				System.out.print("두번째 숫자를 입력해주세요 >> ");
				num3 = getUserInput();
				int answer = calc.multiply(num2, num3);
				System.out.println("정답 >> " + answer);
				break;
			}
			case 4: {
				System.out.print("첫번째 숫자를 입력해주세요 >> ");
				num2 = getUserInput();
				System.out.print("두번째 숫자를 입력해주세요 >> ");
				num3 = getUserInput();
				int answer = calc.divide(num2, num3);
				System.out.println("정답 >> " + answer);
				break;
			}
			case 5: {
				System.out.print(" 종료 ");

				return;
			}
			
			}
			Thread.sleep(2000);
			System.out.println();
			
		}
	}

}