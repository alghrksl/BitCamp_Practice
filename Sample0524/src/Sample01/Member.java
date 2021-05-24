package Sample01;

import java.util.Scanner;

class Calculater {

	void add(int a, int b) {
		System.out.println(a + b);
	}

	void sub(int a, int b) {
		System.out.println(a + b);
	}

	void mul(int a, int b) {
		System.out.println(a + b);
	}

	void divide(int a, int b) {
		System.out.println(a + b);
	}

}

public class Member {

	public static void main(String[] args) {
		int firstnum, secondNum;
		String str;

		Scanner scanner = new Scanner(System.in);

		System.out.println("첫째 값 입력  :");
		firstnum = scanner.nextInt();
		System.out.println("둘째 값 입력  :");
		secondNum = scanner.nextInt();
		System.out.println("수식 입력 :");
		str = scanner.next();

		Calculater Cal = new Calculater();

		switch (str) {
		case "+": {
			Cal.add(firstnum, secondNum);
			break;
		}
		case "-": {
			Cal.sub(firstnum, secondNum);
			break;
		}
		case "/": {
			Cal.divide(firstnum, secondNum);
			break;
		}
		case "*": {
			Cal.mul(firstnum, secondNum);
			break;
		}
		}

	}
}
