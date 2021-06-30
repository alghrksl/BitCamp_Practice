package Again;

import java.util.Scanner;

class Calculater {
	static double fi = 3.14;

	static void circlearea(int firstnum) {
		double a = 2 * fi * firstnum;
		System.out.println(a);
	}

	static void circumferencea(int firstnum) {
		double a = fi * firstnum * firstnum;
		System.out.println(a);
	}

	void add(int a, int b) {
		System.out.println(a + b);
	}

	void sub(int a, int b) {
		System.out.println(a - b);
	}

	void mul(int a, int b) {
		System.out.println(a * b);
	}

	void divide(int a, int b) {

		System.out.println(a / b);
	}

	public static void main(String[] args) {
		String str;
		int firstnum, secondnum, num;

		Scanner scanner = new Scanner(System.in);
		Calculater calculater = new Calculater();

		System.out.println("1. 계산기 ");
		System.out.println("2. 원의 넓이");
		System.out.println("3. 원의 둘레");
		System.out.print("선택 : ");
		num = scanner.nextInt();

		switch (num) {
		case 1: {
			System.out.print("첫째 값 입력  : ");
			firstnum = scanner.nextInt();
			System.out.print("둘째 값 입력  : ");
			secondnum = scanner.nextInt();
			System.out.print("연산자 입력 : ");
			str = scanner.next();

			switch (str) {
			case "+": {
				calculater.add(firstnum, secondnum);
				break;
			}
			case "-": {
				calculater.sub(firstnum, secondnum);
				break;
			}
			case "/": {
				calculater.divide(firstnum, secondnum);
				break;
			}
			case "*": {
				calculater.mul(firstnum, secondnum);
				break;
			}
			}
			break;
		}
		case 2: {
			System.out.print("반지름 입력  : "); // 넓이 2파이r
			firstnum = scanner.nextInt();
			Calculater.circlearea(firstnum);
			break;
		}
		case 3: {
			System.out.print("반지름 입력  : "); // 둘레 파이rr
			firstnum = scanner.nextInt();
			Calculater.circumferencea(firstnum);
			break;
		}

		}

	}

}